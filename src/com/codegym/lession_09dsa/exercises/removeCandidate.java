package com.codegym.lession_09dsa.exercises;

import java.util.List;
 import java.util.Map;;
public class removeCandidate {
    public static void RemoveCandidate(List<Candidates> candidates, Map<Candidates, Integer> RemoveCandidateApp) {
        if (RemoveCandidateApp == null || RemoveCandidateApp.isEmpty()) {
            System.out.println("There is no candidate to delete");
        }
        Map.Entry<Candidates, Integer> entry =  RemoveCandidateApp.entrySet().iterator().next();
        Candidates candidateWillBeRemove = entry.getKey();
        int index = entry.getValue();
        candidates.remove(index);
        System.out.println("Candidate " + candidateWillBeRemove.getFullName() +" is removeed");
    }
}
