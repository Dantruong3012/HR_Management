package com.codegym.lession_09dsa.exercises;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class CandidateList {
    protected static List<Candidates> candidates;

    public static List<Candidates> initializeCandidates(){
        Candidates candidate1 = new  Candidates("Kieu Dan Truong", 21, "Can Kiem", 
    "0123456", "abc@gmail.com", "University", "Java Backend Dev");
        Candidates candidate2 = new Candidates("Long Tran", 25, "Ha Bang", 
    "09988765", "bvc@gmail.com", "college", "Java Fullstack");
        candidates = new LinkedList<>();
        candidates.add(candidate1);
        candidates.add(candidate2);
        return candidates;
    }

    public static void displayCadidateList(List<Candidates> candidates){
        if (candidates.isEmpty()) {
            System.out.println("There is no Cadidate's Information avalible. ");
        }else{
             Iterator<Candidates> iterator = candidates.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        }
    }

    public static void crateNewCadidate(List<Candidates> candidates , String fullname, int age, String homeTown, String phoneNumver, String email, String levelOfEducation, String position ){
        Candidates newCandidates = new Candidates(fullname, age, homeTown, phoneNumver, email,levelOfEducation, position);
        candidates.add(newCandidates);
        System.out.println("\nThe cadidate " + fullname + " is add successfully!" );

    }
}
