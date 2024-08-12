package com.nttdata.archunitdemo1.domain.service;

import com.nttdata.archunitdemo1.domain.entity.Account;

public interface AccountPersistenceService {

  void saveAccount(Account account);
}
