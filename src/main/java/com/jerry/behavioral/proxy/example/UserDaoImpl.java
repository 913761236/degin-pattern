package com.jerry.behavioral.proxy.example;

/**
 * 代理目标类
 *
 * @author qijie
 * @date 2023/7/5
 */
public class UserDaoImpl implements IUserDao{

    @Override
    public void saveUser() {
        System.out.println("保存用户信息------");
    }

}
