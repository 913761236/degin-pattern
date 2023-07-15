package com.jerry.behavioral.visitor;

/**
 * 访问者接口
 *
 * @author qijie
 * @date 2023/7/15
 */
public interface Visitor {

    void visit(Candy candy);

    void visit(Fruit fruit);

    void visit(Wine wine);

}
