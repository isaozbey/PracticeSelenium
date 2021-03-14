package PracticeJava;

import org.testng.annotations.Test;

import java.util.Arrays;

public class mergeArray {

    @Test
    public void test1(){

        int [] num1=new int[] {4,5,6,0,0,0};
        int [] num2=new int[] {1,2,3};


     int index=num1.length-num2.length;

     int k=0;
     for (int i=index ;i<=num1.length-1;i++) {

         num1[i]=num2[k++];



     }

        System.out.println(Arrays.toString(num1));

        for (int i = 0; i <num1.length-1 ; i++) {


            for (int j = i+1; j <num1.length ; j++) {
                int temp=0;
                if (num1[i]>num1[j]) {
                  temp=num1[i];
                  num1[i]=num1[j];
                  num1[j]=temp;


                }


            }


        }



        System.out.println(Arrays.toString(num1));


    }
}
