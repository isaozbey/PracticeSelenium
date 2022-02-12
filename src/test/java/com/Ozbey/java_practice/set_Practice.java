package com.Ozbey.java_practice;

import java.util.HashSet;
import java.util.Set;

public class set_Practice {

    public static void main(String[] args) {


        Set<Student> setOfList=new HashSet<>();
        setOfList.add(new Student(7,"Ibadet"));
        setOfList.add(new Student(8,"Ahmet"));
        setOfList.add(new Student(9,"Muhabbet"));

        System.out.println(setOfList);


    }
}
