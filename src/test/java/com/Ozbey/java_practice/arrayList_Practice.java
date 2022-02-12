package com.Ozbey.java_practice;

import org.testng.annotations.Test;

import java.util.*;

public class arrayList_Practice {

    @Test
    public void test1(){

        List<Student> students=new ArrayList<>();
        students.add(new Student(1,"Jose"));
        students.add(new Student(2,"Syeed"));
        students.add(new Student(3,"Nick"));
        students.add(new Student(4,"Ronnie"));
        //System.out.println(students.get(0));

        //System.out.println(students);

        //for (Student each : students) {
         //   System.out.println(students);
        //}

        //Iterator<Student> iterator=students.iterator();

       // while (iterator.hasNext()) {
         //   System.out.println(iterator.next());
       // }



    }
}
