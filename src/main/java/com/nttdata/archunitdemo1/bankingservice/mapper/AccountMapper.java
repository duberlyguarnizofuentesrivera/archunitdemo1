package com.nttdata.archunitdemo1.bankingservice.mapper;

import com.nttdata.archunitdemo1.bankingservice.dto.AccountInformationDto;
import com.nttdata.archunitdemo1.bankingservice.persistence.sql.entity.BankAccount;
import com.nttdata.archunitdemo1.domain.entity.Account;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AccountMapper {

  AccountMapper INSTANCE = Mappers.getMapper(AccountMapper.class);
  Account toAccount(BankAccount bankAccount);
}
