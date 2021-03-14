package PracticeJava;

import org.junit.Test;


public class SumOfDigit {

    @Test
    public void test1(){
        String str="A2BBA1CC3";
        int result=0;
        String resultDigit="";
        String resultAlpa="";

        char [] chArr=str.toCharArray();

        for (char each :chArr) {
            if (Character.isDigit(each)) {
               resultDigit+=" "+each;
               result+=Integer.parseInt(""+each);

            }else {
                resultAlpa+=" "+each;
            }
        }

        System.out.println("result = " + result);
        System.out.println("result = " + resultAlpa);
        System.out.println("result = " + resultDigit);


    }
}
