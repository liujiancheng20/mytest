package com.itheima.service.impl;

import com.itheima.dao.IAccountDao;
import com.itheima.dao.impl.AccountDaoOracleImpl;
import com.itheima.factory.BeanFactory;
import com.itheima.service.IAccountService;

public class AccountServiceImpl implements IAccountService {

    // 创建dao
    //private IAccountDao accountDao = new AccountDaoImpl();
    // 新需求：更换了数据库改为oracle
    //private IAccountDao accountDao = new AccountDaoOracleImpl();
    // 分析：现在更改了数据库，dao重新写了实现，对sevice有影响，要修改代码。
    // 期望：改dao，不修改service代码。（service与dao解耦的设计）

    // 通过工厂创建对象
    private IAccountDao accountDao =  BeanFactory.getBean("accountDao",IAccountDao.class);

    @Override
    public void save() {
        accountDao.save();
    }
}
