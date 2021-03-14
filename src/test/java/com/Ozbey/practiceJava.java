package com.Ozbey;

import io.cucumber.java.sl.In;

import java.math.BigDecimal;
import java.math.BigInteger;

public class practiceJava {


    public static void main(String[] args) {
        System.out.println("reverse(123) = " + reverse(1534236469));

    }

    public static int reverse(int x) {



        if (x>=Math.pow(2,31) || x<=Math.pow(-2,31)) {
            return 0;
        }

        String  result="";
        String num=x+"";
        int max=Integer.MAX_VALUE;

        if(x<0) {
            result="-";
            for (int i=num.length()-1;i>0;i--) {
                result+=""+num.charAt(i);
            }




            return Integer.valueOf(result);

        }

        for (int i=num.length()-1;i>=0;i--) {
            result+=""+num.charAt(i);
        }


        return Integer.parseInt(result);

    }
}
