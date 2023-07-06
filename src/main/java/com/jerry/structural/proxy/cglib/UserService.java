package com.jerry.structural.proxy.cglib;

import java.util.Collections;
import java.util.List;

/**
 * description
 *
 * @author qijie
 * @date 2023/7/5
 */
public class UserService {

    public List<User> findList() {
        return Collections.singletonList(new User("jerry", 18));
    }
}
