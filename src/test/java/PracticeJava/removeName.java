package PracticeJava;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class removeName {

    @Test
    public void test1(){

        ArrayList<String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));

        Iterator<String> IT=names.iterator();

        while (IT.hasNext()) {

            if (IT.next().equalsIgnoreCase("Ahmed")) {
                IT.remove();
            }
        }


        System.out.println("names = " + names);
    }

    @Test
    public void test2(){
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));

        names.removeIf(p -> p.equalsIgnoreCase("Ahmed"));

        System.out.println("names = " + names);


    }

    @Test
    public void test3(){
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));

        ArrayList<String> name2=new ArrayList<>();

        names.forEach(p -> {if (p.equalsIgnoreCase("Ahmed")) name2.add(p);});

        System.out.println("name2 = " + name2);


    }
}
