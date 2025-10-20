package com.codegym.lession_09dsa.example.hashmap_notice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Student1 {
    private String name;
    private int age;

public Student1 (String name, int age){
    this.name = name;
    this.age = age;
}

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

public int getAge() {
    return age;
}

public void setAge(int age) {
    this.age = age;
}



@Override
public String toString() {
    return "Student1 [name=" + name + ", age=" + age + "]";
}

public static void main(String[] args) {
    Student1 sv1 = new Student1("Truong", 19);
    Student1 sv2 = new Student1("Linh", 22);
    Student1 sv3 = new Student1("Hoang", 21);
    List<Student1> myStudent1s = new ArrayList<>();
    myStudent1s.add(sv1);
    myStudent1s.add(sv2);
    myStudent1s.add(sv3);
    Map<Student1, Integer> myMap = new HashMap<>();
    myMap.put(myStudent1s.get(0), 0);
    myMap.put(myStudent1s.get(1), 1);
    for (Map.Entry<Student1, Integer> entry : myMap.entrySet()) {
        Student1 olStudent = entry.getKey();
        int index = entry.getValue();
        Student1 updated1 = new Student1(olStudent.name + "Updated", olStudent.age+1);
        myStudent1s.set(index, updated1);
    }
    Iterator<Student1> iterator = myStudent1s.iterator();
    while (iterator.hasNext()) {
        System.out.println(iterator.next());
    }
}
}
