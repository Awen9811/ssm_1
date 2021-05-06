package com.service.impl;


import com.dao.AccountDao;
import com.domain.Account;
import com.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Awen
 * @create 2021-04-23 14:07
 */
@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;

    @Override
    public List<Account> findAll() {

        List<Account> list = accountDao.findAll();
        return list;
    }

    @Override
    public void saveAccount(Account account) {
        accountDao.saveAccount(account);
    }
}
