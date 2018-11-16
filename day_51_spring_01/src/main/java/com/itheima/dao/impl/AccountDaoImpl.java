package com.itheima.dao.impl;

import com.itheima.dao.IAccountDao;

public class AccountDaoImpl implements IAccountDao {
    @Override
    public void save() {
        System.out.println("保存账户！");
    }
}
