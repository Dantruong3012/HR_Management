package com.codegym.lession_09dsa.exercises;

public class Candidates {
    private String fullName;
    private int age;
    private String homeTown;
    private String privatePhoneNumber;
    private String privateEmail;
    private String educationalLevel;
    private String positionApply;

    public Candidates (String fullName, int age, String homeTown, 
    String privatePhoneNumber, String privateEmail, String educationalLevel, String positionApply){
        this.fullName = fullName;
        this.age = age;
        this.homeTown = homeTown;
        this.privatePhoneNumber = privatePhoneNumber;
        this.privateEmail = privateEmail;
        this.educationalLevel = educationalLevel;
        this.positionApply = positionApply;
    }

    public Candidates(){
    
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    public String getPrivatePhoneNumber() {
        return privatePhoneNumber;
    }

    public void setPrivatePhoneNumber(String privatePhoneNumber) {
        this.privatePhoneNumber = privatePhoneNumber;
    }

    public String getPrivateEmail() {
        return privateEmail;
    }

    public void setPrivateEmail(String privateEmail) {
        this.privateEmail = privateEmail;
    }

    public String getEducationalLevel() {
        return educationalLevel;
    }

    public void setEducationalLevel(String educationalLevel) {
        this.educationalLevel = educationalLevel;
    }

      public String getPositionApply() {
        return positionApply;
    }

    public void setPositionApply(String positionApply) {
        this.positionApply = positionApply;
    }

    @Override
    public String toString() {
        return "Candidates [ fullName = " + fullName + " , age = " + age + ", home town = " + homeTown + ", private phonenumber = "
                + privatePhoneNumber + ", private email = " + privateEmail + ", educational level = " + educationalLevel
                + ", position apply to  " + positionApply + " ]";
    }

}
