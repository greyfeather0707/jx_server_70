package com.zeroten.javales001.array;

import org.testng.annotations.Test;

import javax.sound.midi.Soundbank;
import java.awt.*;
import java.sql.Array;
import java.sql.SQLOutput;
import java.util.Arrays;

public class ArrayTest {

    @Test
    public void testArrayDeclare(){
        int[] arr5=new int[] {12,13,12};

    }

    @Test
    public void  testArrayBianli(){
        Integer[] arr={1,2,3,4,5,6};

        for(int index=0;index<arr.length;index++){
            System.out.println(arr[index]);
            System.out.printf("arr数组下标 %d 的值为 %d %n",index,arr[index]);
            System.out.println(String.format("index:%d,value:%d",index,arr[index]));
        }


        for(int val:arr){
            System.out.println(String.format("for each,value:%d",val));

        }

        Arrays.asList(arr).forEach(val-> System.out.printf("lambda value is %d %n",val));


    }

    @Test
    public void testArrayCopy(){
        Integer[] arr1={1,2,3,4,5};
        Integer[] arr2={6,7,8,9,10};
        //拷贝数组的前三个元素
        Integer[] arr3=Arrays.copyOf(arr1,3);
        System.out.println(Arrays.toString(arr3));
        //拷贝arr1的第1位到 第3位的元素 不包括第3位
        Integer[] arr4=Arrays.copyOfRange(arr1,0,3);
        System.out.println(Arrays.toString(arr4));
        //拷贝arr2的后3位到arr1的后三位
        System.arraycopy(arr2,arr2.length-3,arr1,arr1.length-3,3);
        System.out.println(Arrays.toString(arr1));

    }



    @Test
    public void testFill(){
        //创建一个长度为 10 内容全为5的int数组，并打印
        //将数组后3位改为3，再打印
        int[] arr=new int[10];
        Arrays.fill(arr,5);
        System.out.println(Arrays.toString(arr));

        Arrays.fill(arr,arr.length-3,arr.length,3);
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void testSort(){
        //示例：定义⼀个⼤⼩为 100 的 int 数组，
        // 随机给每⼀位赋值⼀个 0 ~ 100 之间的数值，
        // 然后对该数组进⾏排序
        // 并打印排序结果。


    }


























}
