package com.codegym.lession_09dsa.linked_list;

import java.util.LinkedList;
import java.util.List;

public class linkedlistExample2 {
    private static final int NUMBER_OF_ELEMENTS = 5;
    public static void main(String[] args) {
        List<String> list1 = new LinkedList<>();
        for(int i = 1; i <= NUMBER_OF_ELEMENTS; i++ ){
            list1.add("0" + i);
        }
        System.out.println("Init list 1 = ");
        printData(list1);
        System.out.println();
         // addAll
        List<String> list2 = new LinkedList<>();
        list2.addAll(list1);
        list2.add("0"+3);
        System.out.println("Init list 2 = " );
        printData(list2);
        // indexOf
        System.out.println("list2.indexOf(03) = " + list2.indexOf("03"));
        System.out.println("list2.indexOf(06) = " + list2.indexOf("06"));
        //remove.
        list2.remove("03");
        System.out.println("After list2.remove(01): list2 = ");
        printData(list2);
        // retainAll
        List<String> list3 = new LinkedList<>();
         list3.addAll(list1);
        LinkedList<String>  list4 = new LinkedList<>();
        list4.add("0" + 2);
        list4.add("0" + 3);
        list3.retainAll(list4);
        System.out.println("After list1.retainAll(list4): list3 = ");
        printData(list3);
        //removeAll
        List<String> list6 = new LinkedList<>();
        for(int i = 2; i< NUMBER_OF_ELEMENTS; i++){
            list6.add("0" + i);
        }
        list6.add("0"+8);
        list6.add("0" + 9);
        List<String> list5 = new LinkedList<>(list1);
        list5.removeAll(list6);
        System.out.println("After list1.removeAll(list6): list5 = ");
        printData(list5);
    }

    public static void printData(List<String> list){
        for (String elements : list) {
            System.out.println(elements);
        }
    }

}
