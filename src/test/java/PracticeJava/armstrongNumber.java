package PracticeJava;

import org.testng.annotations.Test;

public class armstrongNumber {

    @Test
    public void test1(){

        int number=153;
        int a=0;
        int b=0;


        while (number>0) {

            a=number%10;
            number=number/10;

            b=b+(a*a*a);

        }

        System.out.println("b = " + b);
    }
}
