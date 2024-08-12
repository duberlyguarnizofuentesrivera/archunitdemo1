package com.nttdata.archunitdemo1.expose.web;

import com.nttdata.archunitdemo1.bankingservice.dto.AccountInformationDto;
import com.nttdata.archunitdemo1.bankingservice.mapper.BankAccountToAccountInfoMapper;
import com.nttdata.archunitdemo1.domain.service.AccountInformationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/banking-services")
@RequiredArgsConstructor
public class BankAccountController {
  private final AccountInformationService accountInformationService;
  private final BankAccountToAccountInfoMapper mapper;

  @GetMapping("/accounts")
  public Flux<AccountInformationDto> getAccounts(@RequestBody String clientId) {
    return accountInformationService.getAccountsForClient(clientId)
        .map(mapper::toAccountInformationDto);
  }
}
