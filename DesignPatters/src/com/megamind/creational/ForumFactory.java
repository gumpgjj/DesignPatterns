package com.megamind.creational;

import com.megamind.ben.Authorization;

/**
 * Created by gaojj
 * on 2014/4/17.
 * on 12:47
 * Good Life One Day
 */
public class ForumFactory {
    public static Object initLock = new Object();
    public static String className = "com.jiveSoftware.forum.database.DbForumFactory";
    public static ForumFactory factory = null;

    public static ForumFactory getInstanceFactory(Authorization authorization) {
        if (authorization == null) {
            return null;
        }
        if (factory == null) {
            synchronized (initLock) {
                try {
                    Class c = Class.forName(className);
                    factory =(ForumFactory) c.newInstance();
                } catch (Exception e) {
                    System.out.println("异常错误：" + e.getCause().toString());
                }
            }
        }
        //return  new ForumFactoryProxy(authorization,factory,factory.getPermission());
        return  factory;
    }
    public static String  getPermission(){
        return "Administrator";
    }
}