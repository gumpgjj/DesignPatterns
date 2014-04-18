package com.megamind.creational;

import com.megamind.ben.Authorization;

/**
 * Created by gaojj
 * on 2014/4/17.
 * on 12:58
 * Good Life One Day
 */
public class ForumFactoryProxy {
    public ForumFactoryProxy(Authorization authorization, ForumFactory factory, String permission) {

    }

    public ForumFactory ForumFactoryProxy(Authorization authorization, ForumFactory forumFactory, String permission) {
        return forumFactory;
    }
}
