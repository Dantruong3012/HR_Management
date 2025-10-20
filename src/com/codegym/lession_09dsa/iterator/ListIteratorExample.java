package com.codegym.lession_09dsa.iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();
        cities.add("Ha Noi");
        cities.add("TP HCM");
        cities.add("Da Nang");
        cities.add("Sai Gon");
       System.out.println("--- Danh sách ban đầu: " + cities);

       ListIterator<String> iterator = cities.listIterator();
       while (iterator.hasNext()) {
        String city = iterator.next();
        if (city.equals("Sai Gon")) {
            iterator.set("Dong Hoi");
        }
       }

       System.out.println(cities);

       // thêm một phần tử sau đà nẵng.
       ListIterator<String> scIterator = cities.listIterator();
       while (scIterator.hasNext()) {
        String cty = scIterator.next();
        if (cty.equals("Da Nang")) {
            scIterator.add("Hue");
        }
       }
       System.out.println(cities);
       System.out.println("Duyet Nguoc Mang");
       while (scIterator.hasPrevious()) {
        String city = scIterator.previous();
        System.out.println("Index: " + scIterator.nextIndex() + " " + city);
        
       }
    }
}
