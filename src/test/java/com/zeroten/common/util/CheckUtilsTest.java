package com.zeroten.common.util;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckUtilsTest {
    @Test
    public void testEqualString(){
        Integer n1=234;
        Integer n2=234;
        Integer n3=34;
        Assert.assertEquals(CheckUitls.equals(n1,n2),true);
        Assert.assertEquals(CheckUitls.equals(n1,n3),false);

    }
}
