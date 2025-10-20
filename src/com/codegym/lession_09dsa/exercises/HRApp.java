package com.codegym.lession_09dsa.exercises;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class HRApp {
    private static final Scanner sc = new Scanner(System.in);
    private static final List<Candidates>  CANDIDATES_DATA = CandidateList.initializeCandidates();
    public static void main(String[] args) {
        while (true) {
            System.out.println("\n------List Of Functions------");
            System.out.println("\n1. Display candidates list.");
            System.out.println("2. Enter New Candidate Profile.");
            System.out.println("3. Find Candidates.");
            System.out.println("4. Update Cadidate's Information.");
            System.out.println("5. Remove A Cadidate.");
            System.out.println("6. Exit The List.");
            System.out.print("\n Enter the function you want to select: ");
            int functionNumber = sc.nextInt();
            if (functionNumber == 6) {
                return;
            }else{
            switch (functionNumber) {
                case 1:
                    System.out.println("\n-----------------------------------------");
                    System.out.println("\n         LIST OF CANDIDATES. ");
                    System.out.println("\n------------------------------------------");
                    List<Candidates> Current_Candidates = CANDIDATES_DATA;
                    CandidateList.displayCadidateList(Current_Candidates);
                    break;
                 case 2:
                        sc.nextLine();
                        System.out.print("Please enter candidate's full name: ");
                        String fullName = sc.nextLine();
                        System.out.print("Please enter candidate's age: ");
                        int age = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Please enter candidate's hometown: ");
                        String hometown = sc.nextLine();
                        System.out.print("Please enter candidate's phone-number: ");
                        String phoneNumber = sc.nextLine();
                        System.out.print("Please enter candidate's email: ");
                        String email = sc.nextLine();
                        System.out.println("Please indicate cadidate's level of education: ");
                        String educationLevel = sc.nextLine();
                        System.out.print("applied position: ");
                        String position = sc.nextLine();
                        CandidateList.crateNewCadidate(CANDIDATES_DATA,fullName, age, hometown, phoneNumber, email, educationLevel, position);
                    break;
                 case 3:
                    sc.nextLine();
                    System.out.print("Enter phone number to find candidate: ");
                    String CadidatePhoneNumber = sc.nextLine();
                    findCandidates.findingCandidate(CANDIDATES_DATA, CadidatePhoneNumber);
                    break;
                 case 4:
                    updateCandidateInfor.updateInfor(CANDIDATES_DATA);
                    break;
                 case 5:
                    sc.nextLine();
                    System.out.print("\n Enter the number of candidate to find candidate you want to remove: ");
                    String cadidateFindByPhone = sc.nextLine();
                    int indexOfRemoveCandidate = -1;
                    for (int i = 0; i < CANDIDATES_DATA.size(); i++){
                        if (CANDIDATES_DATA.get(i).getPrivatePhoneNumber().equals(cadidateFindByPhone)) {
                            indexOfRemoveCandidate = i;
                        }
                    }
                    if (indexOfRemoveCandidate == -1) {
                        System.out.println("The Candidate is not found");
                    }

                    Map<Candidates, Integer> RemoveCandidateApp = new HashMap<>();
                    RemoveCandidateApp.put(CANDIDATES_DATA.get(indexOfRemoveCandidate), indexOfRemoveCandidate );
                    removeCandidate.RemoveCandidate(CANDIDATES_DATA, RemoveCandidateApp);
                    break;
                default: System.out.println("Function is invaild. ");
                    break;
            }
        }
        }
    }
}
