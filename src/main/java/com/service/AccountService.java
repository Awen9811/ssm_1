package com.service;


import com.domain.Account;

import java.util.List;

/**
 * @author Awen
 * @create 2021-04-23 14:06
 */
public interface AccountService {



    // 查询所有账户
    public List<Account> findAll();




    // 保存帐户信息
    public void saveAccount(Account account);

}
