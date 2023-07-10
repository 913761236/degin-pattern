package com.jerry.behavioral.cfr;

/**
 * 链路中服务模块抽象
 *
 * @author qijie
 * @date 2023/7/10
 */
public abstract class AuthLink {

    protected final String levelUserId;

    protected final String levelUserName;

    private AuthLink next;

    protected AuthLink(String levelUserId, String levelUserName) {
        this.levelUserId = levelUserId;
        this.levelUserName = levelUserName;
    }

    public AuthLink next() {
        return next;
    }

    public AuthLink appendNext(AuthLink next) {
        this.next = next;
        return this;
    }

    public abstract void doAuth(String uId, String orderId, int level);

}
