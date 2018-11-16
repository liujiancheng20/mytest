package com.itheima.dao.impl;

import com.itheima.dao.IAccountDao;

public class AccountDaoOracleImpl implements IAccountDao {
    @Override
    public void save() {
        System.out.println("Oracle保存账户！");
    }
}
