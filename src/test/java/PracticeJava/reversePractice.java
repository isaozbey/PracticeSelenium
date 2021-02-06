package PracticeJava;

import org.testng.annotations.Test;

public class reversePractice {

    @Test
    public void test1(){
        String str="ABCD";
        String result="";

        for (int i = str.length()-1; i >=0 ; i--) {

            result+=str.charAt(i)+"";



        }
        System.out.println(result);
    }

    @Test
    public void test2(){

        String str="ABCD";



        StringBuilder str2=new StringBuilder(str);




        str=str2.reverse().toString();

        System.out.println("str = " + str);


    }
}
