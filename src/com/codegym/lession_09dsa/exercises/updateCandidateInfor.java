package com.codegym.lession_09dsa.exercises;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Consumer;

public class updateCandidateInfor {
    private static final Scanner sc = new Scanner(System.in);
    public static void updateInfor(List<Candidates> cadidateList){
          if (cadidateList== null || cadidateList.isEmpty()) {
            System.out.println("There is no Candidate update! ");
          }
          System.out.print("Please enter the phone number of the candidate you want to search for. ");
          String candidateUpdatePhone = sc.nextLine();
          Candidates candidatesToUpDate = null;
        for (Candidates candidate : cadidateList) {
            if (candidate.getPrivatePhoneNumber().equals(candidateUpdatePhone)) {
                candidatesToUpDate = candidate;
                break;
            }
        }
        if (candidatesToUpDate == null) {
            System.out.println("Not Found");
            return;
        }

        System.out.println("Found candidate: " + candidatesToUpDate);
        System.out.println("\nWhich information do you want to update?");
        System.out.println("1. Full Name");
        System.out.println("2. Age");
        System.out.println("3. Hometown");
        System.out.println("4. Phone Number");
        System.out.println("5. Email");
        System.out.println("6. Education Level");
        System.out.println("7. Applied Position");
        System.out.println("8. Update All Information Of A Candidate");
        System.out.println("0. Cancel");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        sc.nextLine();

        Map<Integer, Consumer<Candidates>> updateAction = new HashMap<>();

        updateAction.put(1, (c) -> {
            System.out.print("Please enter new candidate's fullname: ");
            String newName = sc.nextLine();
            c.setFullName(newName);
            System.out.println("Updated successfully!");

        });

        updateAction.put(2, (c) ->{
            System.out.print("Enter new Cadidate's age: ");
            String ageString = sc.nextLine();
            int age = Integer.parseInt(ageString);
            c.setAge(age);
            System.out.println("Age updated successfully!");
        });

        updateAction.put(3, (c) ->{
            System.out.print("Enter new candidate's hometown: ");
            String newHomeTown = sc.nextLine();
            c.setHomeTown(newHomeTown);
            System.out.println("Hometown updated successfully!");
        });

        updateAction.put(4, (c) -> {
            System.out.println("Enter new candidate's phone");
            String newPhoneNumber = sc.nextLine();
            c.setPrivatePhoneNumber(newPhoneNumber);
            System.out.println("Phone number updated successfully!");
        });


        updateAction.put(5, (c) -> {
            while (true) {
            System.out.print("Enter new candidate's email: ");
            String newEmail = sc.nextLine();
            if (!newEmail.contains("@") || !newEmail.endsWith(".com")) {
                 System.out.println( newEmail + " is invaild email. Please try a gain");
                System.out.println("Do you want to keep editing (Yes or No)");         
                 String answer = sc.nextLine();
                if (answer.equalsIgnoreCase("yes")) {
                    continue;
                }else{
                    System.out.println("Update cancelled.");
                    return;
                }
            }else{
                    c.setPrivateEmail(newEmail);
                    System.out.println("Email updated successfully!");
                    break;
            }
            }
        });

        updateAction.put(6, (c)-> { 
            System.out.print("Enter new candidate's education level: ");
            String newEducationLevel = sc.nextLine();
            c.setEducationalLevel(newEducationLevel);
            System.out.println("Education level updated successfully!");
        });

        updateAction.put(7, (c) ->{
            System.out.print("Enter new apply position: ");
            String newApplyPosititon = sc.nextLine();
            c.setPositionApply(newApplyPosititon);
            System.out.println("Applied position updated successfully!");
        });

        updateAction.put(8, (c) ->{
            System.out.println("Please fill in new candidate information" + c.getFullName());
            //fullname
            System.out.print("\nPlease enter new candidate's fullname: ");
            String newName = sc.nextLine();
            c.setFullName(newName);
            //age
            System.out.print("\nEnter new Cadidate's age: ");
            String ageString = sc.nextLine();
            int age = Integer.parseInt(ageString);
            c.setAge(age);
            //hometown
            System.out.print("\nEnter new candidate's hometown: ");
            String newHomeTown = sc.nextLine();
            c.setHomeTown(newHomeTown);
            //phone
            System.out.println("\nEnter new candidate's phone");
            String newPhoneNumber = sc.nextLine();
            c.setPrivatePhoneNumber(newPhoneNumber);
            //mail
            while (true) {
            System.out.print("\nEnter new candidate's email: ");
            String newEmail = sc.nextLine();
            if (!newEmail.contains("@") || !newEmail.endsWith(".com")) {
                 System.out.println( newEmail + " is invaild email. Please try a gain");
                System.out.println("\nDo you want to keep editing (Yes or No)");         
                 String answer = sc.nextLine();
                if (answer.equalsIgnoreCase("yes")) {
                    continue;
                }else{
                    System.out.println("Update cancelled.");
                    return;
                }
            }else{
                    c.setPrivateEmail(newEmail);
                    System.out.println("Email updated successfully!");
                    break;
            }
            }
            //edu
            System.out.print("\nEnter new candidate's education level: ");
            String newEducationLevel = sc.nextLine();
            c.setEducationalLevel(newEducationLevel);
            //position
            System.out.print("\nEnter new apply position: ");
            String newApplyPosititon = sc.nextLine();
            c.setPositionApply(newApplyPosititon);
             System.out.println("\nall the informations are updated successfully!");
        });

        if (updateAction.containsKey(choice)) {
            updateAction.get(choice).accept(candidatesToUpDate);
        } else {
            System.out.println("Invalid choice or cancelled.");
        }

        System.out.println("Updated candidate data: " + candidatesToUpDate);

    }
}
