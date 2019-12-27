package com.zeroten.javales001.classobject;

import org.testng.annotations.Test;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class ClassAccess {
    public String pub="public--";
    private String prv="private--";
    String def="default--";
    protected String pro="protected--";

    public String getPub(){
        return pub;
    }

    protected String getPro(){
        return pro;
    }

    String getDef(){
        return def;
    }

    private String getPrv(){
        return prv;
    }

    @Test
    public void testInnerAct(){
        System.out.println(pub);
        System.out.println(pro);
        System.out.println(def);
        System.out.println(prv);

        System.out.println(getPub());
        System.out.println(getPro());
        System.out.println(getDef());
        System.out.println(getPrv());

    }
}

