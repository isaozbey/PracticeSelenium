package PracticeJava;

import org.testng.annotations.Test;

import java.util.Arrays;

public class example {

    @Test
    public void test1(){

        int [] numbers={3,4,6,6,3};



         int k=0;

        System.out.println("Iteration"+"   "+ "Arrayss");

        while (true) {

            for (int i = 0; i < numbers.length; i++) {

                if (numbers[i]<10) {
                    numbers[i]+=1;
                }
            }

            System.out.println(k+"         "+ Arrays.toString(numbers));

            k++;
            int count=0;
            for (int i = 0; i <numbers.length ; i++) {
                if (numbers[i]==10) {
                    count++;
                }
                if (count==numbers.length) {
                    return;
                }
            }

        }


    }

}
