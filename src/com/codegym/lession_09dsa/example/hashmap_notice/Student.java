package com.codegym.lession_09dsa.example.hashmap_notice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Student {
    private String name;
    private int age;

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override

    public boolean equals(Object o){
        if (this == o) return true; // cùng reference;
        if (o == null || getClass() != o.getClass()) return false;
        Student that = (Student) o;
        return age == that.age && name.equals(that.name);
    }

    @Override

    public int hashCode(){
        return Objects.hash(name, age);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Truong", 22);
        Student s2 = new Student("Truong", 22);
        List<Student> myStudents = new ArrayList<>();
        myStudents.add(s1);
        myStudents.add(s2);
        Map<Student, Integer> Map = new HashMap<>();
        Map.put(s1, 5);
        System.out.println(Map.get(s2)); // sẽ trả về null bởi vì 2 đối tượng s1 và s2 ở 2 vị trí khác nhau trên heap
        
    }
}
