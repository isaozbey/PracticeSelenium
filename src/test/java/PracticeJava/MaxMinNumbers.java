package PracticeJava;

import org.testng.annotations.Test;

public class MaxMinNumbers {

    int [] arrNumber={9,7,5,2,3,7,58,47,42,15,35,26,69,86,58,78,95,96,93,98,97,99};



    @Test
    public void test1(){


        int maxNum=Integer.MIN_VALUE;


        for (int each :arrNumber) {

            if (each>maxNum){
               maxNum=each;
            }

        }


        System.out.println("maxNum = " + maxNum);

    }

    @Test
    public void test2(){

        int minNum=Integer.MAX_VALUE;

        for (int each : arrNumber) {
            if (each<minNum) {
                minNum=each;
            }
        }

        System.out.println("minNum = " + minNum);

    }


}
