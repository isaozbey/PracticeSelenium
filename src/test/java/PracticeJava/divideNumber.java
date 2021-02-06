package PracticeJava;

import org.testng.annotations.Test;

public class divideNumber {

    @Test
    public void test1(){
        int num =30;
        int num2=6;
        int count=0;

        while (num>=num2) {

            num=num-num2;
            count++;
        }

        System.out.println("count = " + count);

    }
}
