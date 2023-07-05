package com.jerry.behavioral.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理工厂
 *
 * @author qijie
 * @date 2023/7/5
 */
public class JDKProxyFactory {

    private final Object target;

    public JDKProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxyInstance() {
        Class<?> clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), new InvocationHandler() {

            /**
             * 事件处理器
             * 
             * @param proxy 代理对象
             * @param method 代理对象被调用的方法
             * @param args 方法入参
             *
             * @return 被调用方法的返回值
             */
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                // 不考虑try-finally
                System.out.println("开启事务------");
                method.invoke(target, args);
                System.out.println("关闭事务------");
                return null;
            }
        });
    }
}
