package com.zeroten.common.util;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckUtilsTest {
    @Test
    public void testEqualString(){
        String str1="hello";
        String str2="hello";
        String str3="123jfe";
        String str4="hell0";

        Assert.assertEquals(CheckUitls.equals(str1,str2),true);
        Assert.assertEquals(CheckUitls.equals(str1,str3),true);
        Assert.assertEquals(CheckUitls.equals(str1,str4),true);
        Assert.assertEquals(CheckUitls.equals(str3,str2),true);
        Assert.assertEquals(CheckUitls.equals(str4,str2),true);

    }

    @Test
    public void testEqualInteger(){
        Integer n1=234;
        Integer n2=234;
        Integer n3=34;
        Assert.assertEquals(CheckUitls.equals(n1,n2),true);
        Assert.assertEquals(CheckUitls.equals(n1,n3),false);

    }


}
