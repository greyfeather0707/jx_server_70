package com.zeroten.javales001.classobject;

import org.testng.annotations.Test;

public class ClassMethodOverloading {
    public void printlun(){

    }

    public void printlun(int numb){

    }

    public void printlun(String str){

    }

    public void printlun(int numb1,int numb2){

    }

    @Test
    public void testOverLoading(){
        printlun();
        printlun(1);
        printlun(1,2);
        printlun("12fd");
    }


}
