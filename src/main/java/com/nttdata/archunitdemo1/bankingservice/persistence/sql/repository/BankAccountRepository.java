package com.nttdata.archunitdemo1.bankingservice.persistence.sql.repository;

import com.nttdata.archunitdemo1.bankingservice.persistence.sql.entity.BankAccount;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface BankAccountRepository extends ReactiveCrudRepository<BankAccount, Long> {
  Flux<BankAccount> findByClientIdAndAccountStatus(String clientId, String accountStatus);
}
