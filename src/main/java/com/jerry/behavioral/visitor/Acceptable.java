package com.jerry.behavioral.visitor;

/**
 * 接待者接口（抽象元素）
 *
 * @author qijie
 * @date 2023/7/15
 */
public interface Acceptable {

    void accept(Visitor visit);

}
