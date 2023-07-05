package com.jerry.behavioral.proxy.example;

/**
 * 静态代理类
 *
 * @author qijie
 * @date 2023/7/5
 */
public class UserDaoProxy implements IUserDao {

    private final IUserDao target;

    public UserDaoProxy(IUserDao target) {
        this.target = target;
    }

    @Override
    public void saveUser() {
        System.out.println("执行方法前开启事务------");
        target.saveUser();
        System.out.println("执行方法后关闭事务------");
    }
}
