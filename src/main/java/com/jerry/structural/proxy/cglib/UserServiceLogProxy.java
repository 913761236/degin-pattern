package com.jerry.structural.proxy.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * description
 *
 * @author qijie
 * @date 2023/7/5
 */
public class UserServiceLogProxy implements MethodInterceptor {

    public Object getProxyInstance(Object target) {
        Enhancer enhancer = new Enhancer();
        // 设置代理类的父类字节码
        enhancer.setSuperclass(target.getClass());
        // 设置代理的回调
        enhancer.setCallback(this);
        return enhancer.create();
    }

    /**
     * 回调方法
     * 
     * @param o 代理对象
     * @param method 目标方法
     * @param objects 方法入参
     * @param methodProxy 代理方法，用于调用原方法
     * @return 方法返回值
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        // 打印日志记录
        System.out.println("访问记录，当前时间为：" + System.currentTimeMillis());
        System.out.println("执行的方法名称为：" + method.getName());
        // 调用目标方法
        return methodProxy.invokeSuper(o, objects);
    }
}
