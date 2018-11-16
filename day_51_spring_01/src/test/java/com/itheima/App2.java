package com.itheima;


import com.itheima.factory.BeanFactory;
import com.itheima.service.IAccountService;
import com.itheima.service.impl.AccountServiceImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class App2 {
    public static void main(String[] args) throws Exception{
        // 创建service
        //IAccountService accountService = new AccountServiceImpl();

        // 通过工厂创建service
        IAccountService accountService =
                BeanFactory.getBean("accountService", IAccountService.class);
        accountService.save();
    }
}
