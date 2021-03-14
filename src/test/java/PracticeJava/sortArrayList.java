package PracticeJava;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class sortArrayList {

    ArrayList<Integer> list=new ArrayList<>(Arrays.asList(5,14,24,62,35,85,74,47,48,95,68,58,25,27,19,91,37,82,28,45,47));

    @org.junit.Test
    public void test1(){
        Collections.sort(list);

        System.out.println("list = " + list);
    }

    @Test
    public void test2(){


        for (int i = 0; i <list.size() ; i++) {


            for (int j = 0; j <list.size() ; j++) {


                if (list.get(i)<list.get(j)) {
                    Integer temp=list.get(i);

                    list.set(i,list.get(j));
                    list.set(j,temp);

                }


            }

        }

        System.out.println("list = " + list);

    }




}
