package practice2;

import io.cucumber.java.sl.In;
import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;

public class betweenNumber {


    @Test
    public void test1(){

        String str="AAABBCDD";  //A3B2C1D2
        String result="";

        for (int i = 0; i <str.length() ; i++) {

            int count=0;
            for (int j = 0; j <str.length() ; j++) {

                if (str.charAt(i)==str.charAt(j)) {
                    count++;
                }

            }
            if (!(result.contains(str.charAt(i)+""))) {
                result=str.charAt(i)+""+count;
                System.out.print(result);
            }


        }

    }


    @Test
    public void test2(){

        String str="AAABBCDD";  //A3B2C1D2
        String result="";

        for (int i = 0; i <str.length() ; i++) {

            int count=0;
            for (int j = 0; j <str.length() ; j++) {

                if (str.charAt(i)==str.charAt(j)) {
                    count++;
                }

            }
           result+=str.charAt(i)+""+count;
           str=str.replaceAll(str.charAt(i)+"","");



        }

        System.out.println("result = " + result);

    }

    @Test
    public void test3(){

        String str="AAABBCDD";  //A3B2C1D2
        String result="";

        for (int i = 0; i <str.length() ; i++) {

            int count= Collections.frequency(Arrays.asList(str.split("")),str.charAt(i)+"");
             result+=""+str.charAt(i)+count;
            str=str.replaceAll(str.charAt(i)+"","");




        }

        System.out.println("result = " + result);


    }

    @Test
    public void test4(){

        String a="abc";
        String b="abb";


        String[] ch1= a.split("");
        String [] ch2=b.split("");
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        a="";
        b="";

        for (String each : ch1 ) {
            a+=each;
        }
        for (String each :ch2) {
            b+=each;
        }


        System.out.println(a.equals(b));





    }

    @Test
    public void test5(){


        String number="123456789";

        StringBuilder sb=new StringBuilder(number);
        System.out.println("sb.reverse() = " + sb.reverse().toString());


    }

    @Test
    public void  test6(){
        String str6="AA1d6bcdg827hds8";
        String result = "";
        int total=0;

        char [] ch=str6.toCharArray();

        for (char each :ch) {

            if (Character.isDigit(each)) {
                result+=each+"";
                total+=Integer.parseInt(each+"");
            }
        }

        System.out.println("result = " + result);
        System.out.println("total = " + total);


    }


    @Test
    public void test7(){
        String str="Java Java is good";
        String lower="(.*[a-z].*)";

        System.out.println("str.matches(\"Java\") = " + str.matches(lower));

    }
    @Test
    public void test8(){
        int [] numbers=new int[] {34,23,34,52,56,78,13,56,98,12,4,};
        int min=Integer.MIN_VALUE;

    }

    @Test
    public void test9(){
        String a=new String("a");
        String b=new String("a");

        System.out.println("a.equals(b) = " + a==b);

        String x="x";
        String y="x";

        System.out.println("x==y = " + x == y);

        String [] strArr=new String[]{"a","b","c","d"};
        System.out.println("Arrays.toString(strArr) = " + Arrays.toString(strArr)+"3");

        String s="1223";

        String[] ch=s.split("");
    }


    @Test
    public void test10(){

        LocalDate date=LocalDate.now();
        LocalDateTime time=LocalDateTime.now();
        System.out.println("time = " + time);

        System.out.println("date = " + date);


        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yy/mm/dd  hh:mm");

        System.out.println("time.format(dtf) = " + time.format(dtf));


    }

    @Test
    public void test11(){
        String str="10001001001000001";
        int count=0;
        int gap=0;
        for (int i = 0; i <str.length() ; i++) {
            if (str.charAt(i)=='1') {
               innorloop:
                for (int j = 0; j <str.length() ; j++) {
                    if (str.charAt(j)==0) {
                        System.out.println("tess");
                        count++;
                    }if (str.charAt(j)=='1') {
                        if (count>=gap) {
                            System.out.println(count);
                             break innorloop;
                        }
                    }

                }

            }


        }

        System.out.println("gap = " + gap);


    }

    @Test
    public void test12(){
        String str="10001001001000001";

        String [] ch=str.split("1");

        System.out.println("Arrays.toString(ch) = " + Arrays.toString(ch));
         int max= Integer.MIN_VALUE;

         for (String each: ch) {
             if (each.length()>max) {
                 max=each.length();
             }

         }

        System.out.println("max = " + max);

    }






















}
