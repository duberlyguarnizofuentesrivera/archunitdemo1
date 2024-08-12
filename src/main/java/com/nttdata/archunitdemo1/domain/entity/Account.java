package com.nttdata.archunitdemo1.domain.entity;

import com.nttdata.archunitdemo1.domain.enums.AccountStatus;
import com.nttdata.archunitdemo1.domain.enums.AccountType;
import java.time.LocalDateTime;
import lombok.Data;

@Data
public class Account {
  private String clientId;
  private String accountNumber;
  private AccountType accountType;
  private AccountStatus accountStatus;
}
