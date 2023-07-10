package com.jerry.behavioral.cfr;

/**
 * description
 *
 * @author qijie
 * @date 2023/7/10
 */
public class LevelTwoAuth extends AuthLink {
    public LevelTwoAuth(String levelUserId, String levelUserName) {
        super(levelUserId, levelUserName);
    }

    @Override
    public void doAuth(String uId, String orderId, int level) {
        AuthLink next = super.next();
        if (next != null) {
            next.doAuth(uId, orderId, level);
        }

        if (level >= 2) {
            System.out.println("订单：" + orderId + "，2级审批完成，人员：" + levelUserId + "，名称：" + super.levelUserName);
        }
    }
}
