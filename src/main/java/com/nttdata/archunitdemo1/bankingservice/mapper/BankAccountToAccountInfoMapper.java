package com.nttdata.archunitdemo1.bankingservice.mapper;

import com.nttdata.archunitdemo1.bankingservice.dto.AccountInformationDto;
import com.nttdata.archunitdemo1.bankingservice.persistence.sql.entity.BankAccount;
import com.nttdata.archunitdemo1.domain.entity.Account;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BankAccountToAccountInfoMapper {
  BankAccountToAccountInfoMapper INSTANCE = Mappers.getMapper(BankAccountToAccountInfoMapper.class);
  AccountInformationDto toAccountInformationDto(Account account);
}
