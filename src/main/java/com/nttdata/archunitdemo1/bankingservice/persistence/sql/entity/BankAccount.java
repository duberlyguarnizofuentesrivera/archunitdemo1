package com.nttdata.archunitdemo1.bankingservice.persistence.sql.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class BankAccount {
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  private long id;
  private String clientId;
  private String accountNumber;
  private String accountType;
  private String accountStatus;
  private LocalDateTime createdDate;
  private LocalDateTime updatedDate;

}
