package PracticeJava;

import org.testng.annotations.Test;

import java.math.BigInteger;
import java.util.Scanner;

public class primeNumber {

    @Test
    public void test1(){

        int num=11;
        int count=0;

        for (int i = 2; i <num ; i++) {

          if (num%i==0){
              count++;
          }
        }

        if (count==0){
            System.out.println("Prime   "+count);
        }else
            System.out.println(" NOt Prime   "+count);

    }


    @Test
    public void test(){

        Scanner in = new Scanner(System.in);
        BigInteger n = in.nextBigInteger();
        in.close();
        if (n.isProbablePrime(1)) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }

    }

    @Test
    public void test2(){}

    BigInteger num= BigInteger.valueOf(12);




}
