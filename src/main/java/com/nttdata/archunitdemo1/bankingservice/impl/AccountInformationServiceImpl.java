package com.nttdata.archunitdemo1.bankingservice.impl;

import com.nttdata.archunitdemo1.bankingservice.dto.AccountInformationDto;
import com.nttdata.archunitdemo1.bankingservice.mapper.AccountMapper;
import com.nttdata.archunitdemo1.bankingservice.mapper.BankAccountToAccountInfoMapper;
import com.nttdata.archunitdemo1.bankingservice.persistence.sql.repository.BankAccountRepository;
import com.nttdata.archunitdemo1.domain.entity.Account;
import com.nttdata.archunitdemo1.domain.enums.AccountStatus;
import com.nttdata.archunitdemo1.domain.service.AccountInformationService;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;

@RequiredArgsConstructor
public class AccountInformationServiceImpl implements AccountInformationService {
  private final BankAccountRepository accountRepository;
  private final BankAccountToAccountInfoMapper bankAccountMapper;
  private final AccountMapper accountMapper;

  @Override
  public Flux<Account> getAccountsForClient(String clientId) {
    String active = AccountStatus.ACTIVE.name();
    return accountRepository
        .findByClientIdAndAccountStatus(clientId, active)
        .map(accountMapper::toAccount)
        .map(account -> {
          account.setClientId(clientId);
          return account;
        });
  }

  public Flux<AccountInformationDto> getAccountsInformation(String clientId) {
    return getAccountsForClient(clientId).map(bankAccountMapper::toAccountInformationDto);
  }
}
