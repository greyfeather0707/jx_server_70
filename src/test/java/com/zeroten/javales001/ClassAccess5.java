package com.zeroten.javales001;

import com.zeroten.javales001.classobject.ClassAccess;
import org.testng.annotations.Test;

import java.sql.SQLOutput;

public class ClassAccess5 {

    @Test
    public void TestAcl() {
        ClassAccess ca = new ClassAccess();

        System.out.println(ca.pub);
//            System.out.println(ca.pro);
//            System.out.println(ca.def);
        //        System.out.println(ca.prv);

        System.out.println("=============");

        System.out.println(ca.getPub());
//        System.out.println(ca.getPro());
//        System.out.println(ca.getDef());
        //        System.out.println(ca.getPrv());
    }

}
