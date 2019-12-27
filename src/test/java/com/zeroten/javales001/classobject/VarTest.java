package com.zeroten.javales001.classobject;

import org.testng.annotations.Test;

public class VarTest {
    //没有使用static修饰的实例变量
    //每个实例有单独的拷贝
    // index用于存放当前类的第一个实例
    private int index;

    //用static修饰的类变量，所有实例共享
    //用于记录创建的该累的实例的个数
    private static int count=0;

    public VarTest(){

    }

    public VarTest(int index){
        this();
        this.index=index;
    }

    public VarTest(int index,int count){
        this(index);
        this.count=count;
    }

    public void println(){
        String logStr=String.format("当前创建第%d个实力，共%d个",index,count);
        System.out.println(logStr);
    }


    public static void main(String[] args) {
        VarTest v1=new VarTest();
        v1.index=1;
        VarTest.count++;

//        System.out.println("当前创建第"+v1.index+"个实例，共"+VarTest.count);
        v1.println();

        VarTest v2=new VarTest();
        v2.index=2;
        VarTest.count++;
        //System.out.println("当前创建第"+v2.index+"个实例，共"+VarTest.count);
        v2.println();

        System.out.println("v1_count:  "+v1.count);
        System.out.println("v2_count:  "+v2.count);
        System.out.println("v1_index:  "+v1.index);
        System.out.println("v1_index:  "+v1.index);

        VarTest v3=new VarTest(3,3);
        System.out.println("v3_index:  "+v3.index);
        System.out.println("v3_count:  "+v3.count);
        v3.println();


    }

}
