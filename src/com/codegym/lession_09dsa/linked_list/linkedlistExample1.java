package com.codegym.lession_09dsa.linked_list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class linkedlistExample1 {
    private static final int NUMBER_OF_ELEMENT = 5;
    public static void main(String[] args) {
        List<StudentList> students = new LinkedList<>();

        for (int i = 1; i < NUMBER_OF_ELEMENT; i++ ){
            students.add(new StudentList(i, "My name: " + i));
        }
        Iterator<StudentList> student = students.iterator();
        while (student.hasNext()) {
            System.out.println(student.next());
        }
       
    }
}
