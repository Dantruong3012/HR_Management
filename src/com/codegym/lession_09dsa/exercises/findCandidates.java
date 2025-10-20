package com.codegym.lession_09dsa.exercises;

import java.util.Iterator;
import java.util.List;

public class findCandidates {
    public static void findingCandidate(List<Candidates> candidate, String phoneNumber){
       Iterator<Candidates> myListOfCandidates = candidate.iterator();
       while (myListOfCandidates.hasNext()) {
        Candidates LookedCandidate = myListOfCandidates.next();
        String Cadidate = LookedCandidate.getPrivatePhoneNumber();
            if (Cadidate.equals(phoneNumber)) {
                System.out.println(LookedCandidate);
            }
        }
    }
 }
