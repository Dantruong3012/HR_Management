package com.codegym.lession_09dsa.linked_list;

public class StudentList {
    private int id;
    private String name;

    public StudentList (int id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "StudentList [ id = " + id + " , name = " + name + "]";
    }

    
}
