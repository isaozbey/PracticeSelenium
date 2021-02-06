package PracticeJava;

import org.testng.annotations.Test;

import java.util.Arrays;

public class sortNumbers {


    @Test
    public void test1(){
        int [] numbers=new int[] {5,7,8,6,3,2,4,9,1,27,21};

        for (int i = 0; i <numbers.length ; i++) {


            for (int j = 0; j <numbers.length ; j++) {

                int temp=0;
                if (numbers[i]<numbers[j]) {

                    temp=numbers[j];
                    numbers[j]=numbers[i];
                    numbers[i]=temp;

                }

            }

        }

        System.out.println("Arrays.toString(numbers) = " + Arrays.toString(numbers));

    }

    @Test
    public void test2(){
        int [] arr={5,7,8,9};

        arr[2]=1;

        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
    }

    @Test
    public void test3(){

        int N=5;


        int[] result = new int[N];

        int sum = 0;

        for(int i=0; i < N-1; i++) {

            result[i] =i;

            sum += i;

        }

        result[N-1] = -sum;

        System.out.println("result = " + Arrays.toString(result));


    }
}
