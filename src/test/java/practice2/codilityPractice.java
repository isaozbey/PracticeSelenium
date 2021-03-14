package practice2;

import org.testng.annotations.Test;

import java.util.Arrays;

public class codilityPractice {

    @Test
    public int test1(){

         int [] A=new int[] {1,2,4,5,6};

         Arrays.sort(A);
         int smallest=1;

         if (A.length==0) return smallest;

         if (A[A.length-1]==0) return smallest;
         for (int each : A) {

             if (each==smallest) {
                 smallest++;
             }
         }

          return  smallest;

    }

    @Test
    public void test2(){


        int n=5;
        String result="";
        int k;

        while (n>1) {

         k=n%2;
         result=k+result;
         n=n/2;

        }

        result=n+result;
        int count=0;
        int gap=0;
        System.out.println("result = " + result);

        for (int i=0; i<result.length();i++) {
            if (result.charAt(i)=='1') {
               System.out.println("passed");
                for (int j = i; j <result.length() ; j++) {

                    if (result.charAt(j)=='0') {
                        count++;
                        System.out.println("count = " + count);
                    }if (result.charAt(j)=='1') {
                         if (count>gap) {
                             gap=count;
                             System.out.println("tesssssss");
                         }
                        count=0;
                        break;
                    }
                }


            }
            System.out.println("gap = " + gap);

        }



    }
}
