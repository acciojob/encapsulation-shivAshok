package com.driver;

public class Main {

    public static void main(String args[]){
        RWOnly obj = new RWOnly();
        // Try setting a value to name by directly accessing it using obj
        // obj.name = "John"; // Error: name has private access in RWOnly

        // Try printing the value of name
        //System.out.println(obj.name); // Error: name has private access in RWOnly

        // Try setting a value to name using setter function
        obj.setName("John");

        // Try accessing the value of name using getter function
        System.out.println(obj.getName()); // Output: John
    }

}