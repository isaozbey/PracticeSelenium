package com.Ozbey.utilities;

import io.cucumber.java.sl.In;
import org.testng.annotations.Test;

public class practice2 {

    @Test
    public void test1(){


        //System.out.println("num = " + isPalindrome(123321));

    }




    public boolean isPalindrome(int x) {
        int count=0;
        String str=""+x ;
        if (x<0) {
            return false;
        }else {



            for (int i=0;i<str.length()/2;i++) {

                if (str.charAt(i)==str.charAt(str.length()-i-1 ))
                    count++;
            }
        }

        if (count==(str.length()/2)){
            return true;
        }
        return  false;

    }






}
