package PracticeJava;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class removeNumbers {

    @Test
    public void test1(){
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,101,200,300));

        ArrayList<Integer> list2=new ArrayList<>();

        list1.forEach(p -> {if (p<100) list2.add(p);});

        System.out.println("list1 = " + list2);

    }

    @Test
    public void test2(){
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,101,200,300));


        for (Iterator<Integer> it =list1.iterator() ; it.hasNext() ;) {


            if (it.next()>100){
                it.remove();
            }
        }

        System.out.println("list1 = " + list1);

    }



}
