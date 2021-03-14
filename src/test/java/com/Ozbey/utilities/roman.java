package com.Ozbey.utilities;

import org.testng.annotations.Test;

public class roman {

    @Test
    public void test1(){
        String str="MCMXCIV";
        char [] romanArr=str.toCharArray();

        for (int i = 0; i <romanArr.length; i++) {

            if (romanArr[i]=='I') {
                romanArr[i]=1;
            }if (romanArr[i]=='V') {
                romanArr[i]=5;
            }if (romanArr[i]=='X') {
                romanArr[i]=10;
            }if (romanArr[i]=='L') {
                romanArr[i]=50;
            }if (romanArr[i]=='C') {
                romanArr[i]=100;
            }if (romanArr[i]=='D') {
                romanArr[i]=500;
            }if (romanArr[i]=='M') {
                romanArr[i]=1000;
            }

        }
           int sum=0;
        for (int i = 0; i <romanArr.length-1 ; i++) {
            if (romanArr[i]<romanArr[i+1]) {
                sum-=romanArr[i];
            }else {
                sum+=romanArr[i];
            }
        }

        sum=sum+romanArr[romanArr.length-1];


    }
}
