package PracticeJava;

import org.testng.annotations.Test;

public class fibonacciNumber {

    @Test
    public void test1(){

        int N=20;
        int num=0;
        int num1=1;
        int result=0;


        for (int i = 0; i <N ; i++) {


            result=num1+num;
            num=num1;
            num1=result;

            System.out.print(result+" ");

        }

    }
}
