package com.zeroten.javales001.classobject;

import org.testng.annotations.Test;

import javax.sound.midi.Soundbank;

public class ClassMethodParamTest {

    private void changePrimitive(int numb){
        System.out.println("send:"+numb);
        numb=20;
        System.out.println("modify:"+numb);
    }

    private void changeReference(StringBuilder sb) {
        System.out.println("send:"+sb.toString());
        sb.append("-append");
        System.out.println("modify:"+sb.toString());

        sb=new StringBuilder();
        sb.append("new");
    }

    @Test
    public void testModifyMethodParam(){

        int numb=10;
        changePrimitive(numb);
        System.out.println("numb="+numb);

        System.out.println("=====================");


        StringBuilder sb=new StringBuilder();
        sb.append("字符串");
        changeReference(sb);
        System.out.println(sb.toString());
    }





}
