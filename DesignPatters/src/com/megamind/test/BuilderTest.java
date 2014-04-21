package com.megamind.test;

import com.megamind.creational.build.Builder;
import org.junit.Test;

/**
 * Created by gaojj
 * on 2014/4/18.
 * on 17:18
 * Good Life One Day
 */
public class BuilderTest {
    @Test
    public void testProduce(){
        Builder builder = new Builder();
        builder.produceMailSender(10);
    }
}
