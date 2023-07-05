package com.jerry.behavioral.proxy.example;

/**
 * 静态代理方式<br/>
 * 优点：不修改目标类即可实现功能拓展<br/>
 * 缺点：目标修改时，代理类也需要修改，并且不易维护<br/>
 *
 * @author qijie
 * @date 2023/7/5
 */
public class ProxyPatternTest {

    public static void main(String[] args) {
        UserDaoImpl dao = new UserDaoImpl();
        UserDaoProxy proxy = new UserDaoProxy(dao);
        proxy.saveUser();
    }

}
