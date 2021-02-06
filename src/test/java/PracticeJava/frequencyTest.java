package PracticeJava;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class frequencyTest {


    @Test
    public void test1(){
        String str="AAABBCDD";   //  A3B2C1D2
        String result="";

        for (int i = 0; i < str.length(); i++) {

            int count=0;

            for (int j = 0; j <str.length() ; j++) {

                if (str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }

            if (!result.contains(str.charAt(i)+"")) {

                result+=""+str.charAt(i)+count;
            }

        }

        System.out.println("result = " + result);

    }


    @Test
    public void test2(){
        String str="AAABBBAADDCC";   //  A3B2C1D2
        String result="";

        for (int i = 0; i <str.length() ; i++) {
            int count=0;

            for (int j = 0; j <str.length() ; j++) {

                if (str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }

            result+=str.charAt(i)+""+count;

            str=str.replaceAll(""+str.charAt(i),"");



        }

        System.out.println(result);

    }


    @Test(description = "test3")
    public void test3(){
        String str="AAABBBAADDCC";   //  A3B2C1D2

        HashSet<String> setStr=new HashSet<>(Arrays.asList(str.split("")));

        for (int i = 0; i <str.length() ; i++) {

            int count=Collections.frequency(setStr,str.charAt(i));

        }


    }

}
