package com.zeroten.javales001.array;

import org.testng.annotations.Test;

import javax.sound.midi.Soundbank;
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
}
