package com.codegym.lession_09dsa.lambdaExpression;

interface helloWorld {
    /*0 tham so*/
    // public String sayHello();
    /*---------------------- */
    /*1  tham so  */
    // String sayHello(String name);
    /*---------------------------- */
    /*Nhieu tham so */
    public String sayHey(String name, String greet);
}

public class InnerhelloWorld {
    public static void main(String[] args) {

    /*-----------------------------------*/
        /*0 tham so*/
    // helloWorld user = () -> {
    //    return "Hello World";
    // };
    // System.out.println(user.sayHello());

    /*-----------------------------------*/
        /*1 tham so */
        // helloWorld user = (name) -> {
        //     return "Hello" + name;
        // };
        // System.out.println(user.sayHello(" Truong"));
    /*------------------------------------*/

    /*-----------------------------------*/
        /*nhieu tham so */
    helloWorld user = (name, greet) -> {
        return "Hello" + " " + name + " " + greet;
    };
    System.out.println(user.sayHey(" Truong ", " Wellcome to the computer "));
    }
}
