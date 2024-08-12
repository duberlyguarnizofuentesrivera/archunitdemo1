package com.nttdata.archunitdemo1.bankingservice.dto;

import com.nttdata.archunitdemo1.domain.enums.AccountStatus;
import com.nttdata.archunitdemo1.domain.enums.AccountType;

public record AccountInformationDto(String accountNumber, AccountType accountType,
                                    AccountStatus accountStatus) {
}
