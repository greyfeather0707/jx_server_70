package com.zeroten.javales001.classobject;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Date;

public class PkgTest {
    @Test
    public void testPkg(){
//        java.util.Date date=new java.util.Date();
//        System.out.println(date.toString());
//
        Date date3=new Date();
        System.out.println(date3.toString());

        int[] numb1=new int[3];
        int[] numb2=new int[]{1,2,3};
        int[] numb3={12,3,4};

        System.out.println(Arrays.toString(numb3));



    }
}
