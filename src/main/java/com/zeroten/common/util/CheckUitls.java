package com.zeroten.common.util;

public class CheckUitls {

    public static boolean equals(String str1,String str2){
        if (str1.length()!=str2.length()){
            return false;
        }

        for(int n=0;n<str1.length();n++){
            if (str1.charAt(n)!=str2.charAt(n)){
                return false;
            }
        }
        return true;
    }


    public static boolean equals(Integer n1,Integer n2){
        return n1.intValue()==n2;
    }
}
