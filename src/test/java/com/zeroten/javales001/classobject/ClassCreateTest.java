package com.zeroten.javales001.classobject;

import java.awt.*;

public class ClassCreateTest {
//    private String name="这是一个成员变量";

    private String name;
    {
        //name="这是一个成员变量--代码块";
        System.out.println("代码块");
    }

    static {
        System.out.println("静态代码块");
    }
    public ClassCreateTest(){
        name="这是一个成员变量--构造";
    }

    public void println(){
        System.out.println(name);
    }

    public static void main(String[] args) {
        new ClassCreateTest().println();
        new ClassCreateTest().println();
        new ClassCreateTest().println();

        new ClassCreateTest().println();

    }
}
