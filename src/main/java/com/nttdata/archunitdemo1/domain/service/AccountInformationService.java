package com.nttdata.archunitdemo1.domain.service;

import com.nttdata.archunitdemo1.domain.entity.Account;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public interface AccountInformationService {
   Flux<Account> getAccountsForClient(String clientId);
}
