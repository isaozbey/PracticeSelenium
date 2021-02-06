package PracticeJava;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class sameLetters {

    @Test
    public void test1(){
        String str="abc";
        String str2="abb";

        Set<String> strNonDup=new TreeSet<>(Arrays.asList(str.split("")));
        Set<String> strNonDup2=new TreeSet<>(Arrays.asList(str2.split("")));
        str=strNonDup.toString();
        str2=strNonDup2.toString();

        System.out.println(strNonDup.equals(strNonDup2));

        System.out.println(str.equals(str2));


    }


}
