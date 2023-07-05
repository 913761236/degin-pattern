package com.jerry.behavioral.proxy.jdk;

import com.jerry.behavioral.proxy.example.IUserDao;
import com.jerry.behavioral.proxy.example.UserDaoImpl;

/**
 * JDK动态代理实现<br/>
 * 动态代理是在运行时动态生成字节码并装载到JVM中<br/>
 * JDK动态代理是基于接口实现动态代理的<br/>
 * 
 * JVM类加载过程：装载，连接（验证，准备，解析），初始化<br/>
 * 加载过程主要任务：<br/>
 * 1.获取定义类的二进制字节流 <br/>
 * 2.将字节流代表的静态存储结构转化为方法区的运行时数据结构 <br/>
 * 3.生成代表这个类的java.lang.Class对象，作为访问这个类各种数据的访问入口<br/>
 * 
 * JVM并没有规定加载的字节码从哪里来，这就为动态代理提供了条件，可以在运行时动态计算生成<br/>
 * 
 * @author qijie
 * @date 2023/7/5
 */
public class JDKDynamicProxyTest {
    public static void main(String[] args) {
        UserDaoImpl dao = new UserDaoImpl();
        IUserDao proxy = (IUserDao)new JDKProxyFactory(dao).getProxyInstance();
        proxy.saveUser();
    }
}
