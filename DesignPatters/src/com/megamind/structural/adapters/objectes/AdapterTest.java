package com.megamind.structural.adapters.objectes;

import com.megamind.structural.adapters.classes.Source;
import com.megamind.structural.adapters.classes.Targetable;
import org.junit.Test;

/**
 * Created by megamind
 * on 2014/4/21.
 * on 9:33
 * Good Life One Day
 */
public class AdapterTest {
    @Test
    public void testAdapter() {
        Source source = new Source();
        Targetable targetable = new Wrapper(source);
        targetable.method1();
        targetable.method2();
    }
}
