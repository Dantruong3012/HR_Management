package com.codegym.lession_09dsa.iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class InteratorExample {
    public static void main(String[] args) {
        Collection<String> cities = new ArrayList<>();
        cities.add("Ha Noi");
        cities.add("Da Nang");
        cities.add("Hai Phong");
        cities.add("HCM");
//Test indexOf
 List<String> cities2 = new ArrayList<>();
        cities2.add("Ha Noi");
        cities2.add("Da Nang");
        cities2.add("Hai Phong");
        cities2.add("HCM");
        cities2.add("Hai Phong");
        int index = cities2.indexOf("Hai Phong");
        int index2 = cities2.lastIndexOf("Hai Phong");
        System.out.println(index);
        System.out.println(index2);
        // for (String city : cities) {
        //     System.out.println(city);
        // }

        Iterator<String> iterator = cities.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
            if (element.equals("Ha Noi")) {
                iterator.remove();
            }
        }
        System.out.println(cities);
    }
}
