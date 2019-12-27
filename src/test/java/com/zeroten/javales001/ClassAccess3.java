package com.zeroten.javales001;

import com.zeroten.javales001.classobject.ClassAccess;
import org.testng.annotations.Test;

public class ClassAccess3 extends ClassAccess {
    @Test
    public void TestAcl(){

        System.out.println(pub);
        System.out.println(pro);
//        System.out.println(def);
//        System.out.println(prv);

        System.out.println(getPub());
        System.out.println(getPro());
//        System.out.println(getDef());
//        System.out.println(getPrv());

    }
}

