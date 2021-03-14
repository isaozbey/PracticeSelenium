package PracticeJava;

import org.testng.annotations.Test;

import java.util.Arrays;

public class maxSubArray {

    @Test
    public void test1(){
        int [] num=new int[]{-2,1,-3,4,-1,2,1,-5,4};
        int count=0;
        int max=num[0];


        for (int i = 0; i <num.length ; i++) {
            int sum=0;

            for (int j = i; j <num.length; j++) {


            }

        }


    }

    @Test
    public void test2(){
        String s="      ";

        System.out.println("s.length() = " + s.length());
    }

    @Test
    public void test3(){
        int [] arr=new int[]{5,4,2};

        arr[1]=9;

        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
    }
    @Test
    public void test4(){


        String a="1010";
        String b="1011";
        StringBuilder sb=new StringBuilder();


        int i=a.length()-1;
        int j=b.length()-1;
        int cary=0;

        while (i>=0 ||j>=0) {
            int sum=cary;

         if (i>=0) {
             sum+=a.charAt(i--)-'0';
         }
         if (j>=0) {
                sum+=b.charAt(j--)-'0';
         }

         sb.insert(0,sum%2);
         cary=sum/2;

         if (cary>0) {
             sb.insert(0,1);
         }


        }
          System.out.println("sb="+sb);



    }
    @Test
    public int test5(){


        int x =64;
        long value=0;
        long mid=x/2;


        while(mid>0) {

            long mid2=(x/2);
            if (mid*mid==x) {
                return (int) mid;
            }else if (x>mid2*mid2) {
                
            }

        }

        return (int) value;

    }


































}
