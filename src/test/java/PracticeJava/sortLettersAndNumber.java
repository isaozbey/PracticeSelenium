package PracticeJava;

import org.testng.annotations.Test;

import java.util.Arrays;

public class sortLettersAndNumber {

    @Test
    public void test1(){
        String str ="DC501GCCCA098911";

        String str2="";

        for (int i = 0; i <str.length() ; i++) {


            str2+=""+str.charAt(i);  //DC,GCCCA,501,098911    //


            if (Character.isAlphabetic(str.charAt(i)) && i<str.length()-1) {

                if (Character.isDigit(str.charAt(i+1))){
                    str2+=",";
                }

            }


            if (Character.isDigit(str.charAt(i)) && i<str.length()-1) {

                if (Character.isAlphabetic(str.charAt(i+1))) {
                    str2+=",";
                }
            }
        }


        String [] arrStr2=str2.split(",");
        String result="";

        for (String each: arrStr2 ) {

            char [] ch=each.toCharArray();
            Arrays.sort(ch);

            for (char each2: ch ){
                result+=""+each2;
            }

        }


        System.out.println("str2 = " + result);
    }

}
