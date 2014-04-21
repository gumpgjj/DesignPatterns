package com.megamind.structural.facade;

/**
 * Created by megamind
 * on 2014/4/21.
 * on 10:16
 * Good Life One Day
 */
public abstract class  Operate {
   public  void startup(){
       System.out.println(this.getClass().getName().substring(31)+"== startup ==");
   }
   public void shutdown(){
       System.out.println(this.getClass().getName().substring(31)+"== shutdown ==");

   }
}
