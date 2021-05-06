package com.test;


import com.domain.Account;
import com.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author Awen
 * @create 2021-04-23 14:16
 */
public class TestSpring {
    @Test
    public void test(){
         ApplicationContext ac= new
                 ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        AccountService as = (AccountService)
                ac.getBean("accountServiceImpl",AccountService.class);
        List<Account> list = as.findAll();
        for(Account account : list){
            System.out.println(account);
        }

    }
}
