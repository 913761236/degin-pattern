package com.jerry.behavioral.visitor;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

/**
 * 访问者模式<br/>
 * 将对象的操作和对象的结构分离，解决数据和算法的耦合问题<br/>
 * 
 * @author qijie
 * @date 2023/7/14
 */
public class VisitorPatternTest {

    public static void main(String[] args) {
        Candy candy = new Candy("巧克力糖", LocalDate.now(), 100);
        Wine wine = new Wine("茅台", LocalDate.of(2021, 6, 10), 1800);
        Fruit fruit = new Fruit("香蕉", LocalDate.of(2023, 7, 10), 10, 2);

        DiscountVisit discountVisit = new DiscountVisit(LocalDate.now());

        List<Product> list = Arrays.asList(candy, wine, fruit);
        for (Product product : list) {
            product.accept(discountVisit);
        }

    }

}
