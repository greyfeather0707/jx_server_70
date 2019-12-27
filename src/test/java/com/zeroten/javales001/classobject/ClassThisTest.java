package com.zeroten.javales001.classobject;

import org.testng.annotations.Test;

public class ClassThisTest {
    private int index;

    public  ClassThisTest(){


    }

    public void println(String name){
        System.out.println(index+".hello,"+name);

    }


    public void println(int... numbs) {
        if (numbs == null) {
            System.out.println("is null");
        }

        if (numbs.length == 0) {
            System.out.println("param length is zero");
        }


        for (int n = 0; n < numbs.length; n++) {
            System.out.println(numbs[n]);
        }
    }
    @Test
    public void test1(){
        ClassThisTest obj=new ClassThisTest();
        obj.println("wendy");
    }


    @Test
    public  void testPrintParams(){
        println();
        println(1);
        println(12,3,4,5);
    }


}
