package com.jerry.behavioral.proxy.cglib;

import java.util.List;

/**
 * cglib动态代理<br/>
 * cglib是基于ASM（字节码工具类）来操作字节码实现动态代理的<br/>
 *
 * cglib动态代理基于继承的方式完成代理类生成<br/>
 *
 * @author qijie
 * @date 2023/7/5
 */
public class CglibDynamicProxyTest {

    public static void main(String[] args) {
        UserService userService = new UserService();
        UserService proxy = (UserService)new UserServiceLogProxy().getProxyInstance(userService);
        List<User> list = proxy.findList();
        System.out.println(list);
    }

}
