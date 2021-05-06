package com.controller;

import com.domain.Account;
import com.service.AccountService;
import org.apache.ibatis.annotations.ResultMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.reflect.MulticastDelegate;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author Awen
 * @create 2021-04-23 14:45
 */
@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;


    @RequestMapping("/findAll")
    public String finAll(Model model) {
        List<Account> list = accountService.findAll();
        model.addAttribute("list", list);
        return "succees";


    }

    /**
     * 保存
     * @param account
     * @param request
     * @param response
     * @throws IOException
     */
    @RequestMapping("/save")
    public void save(Account account, HttpServletRequest request, HttpServletResponse response) throws IOException {
        accountService.saveAccount(account);
        response.sendRedirect(request.getContextPath()+"/account/findAll");
        return ;
    }



}
