package PracticeJava;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class uniqueCharMap {


    @Test
    public  void test1(){


        String str = "accabbcexvd";
        Map<Character, Integer> unique = new HashMap<>();


        for (int i = 0; i <str.length() ; i++) {
            int count=0;

            for (int j = 0; j <str.length() ; j++) {

                if (str.charAt(i)==str.charAt(j)) {
                    count++;
                }

            }

            if (count==1){
                unique.put(str.charAt(i),count);
            }
        }

        System.out.println("unique = " + unique);
    }

}
