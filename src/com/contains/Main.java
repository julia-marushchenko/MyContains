// Java program to find special phrase in string

package com.contains;

// Main class
public class Main {

    // Main method to run java program
    public static void main(String[] args) {

        // Creating string
        String str = "Shine";

        // Checking if this string has ´in´ and printing to console true or false
        System.out.println(str.contains("in")); // true

        // Checking if this string has ´ne´ and printing to console true or false
        System.out.println(str.contains("ne")); // true

        // Checking if this string has ´st´ and printing to console true or false
        System.out.println(str.contains("st")); // false

        // Checking if this string has ´hi´ and printing to console true or false
        System.out.println(str.contains("hi")); // true

        // Checking if this string has ´fa´ and printing to console true or false
        System.out.println(str.contains("fa")); // false
    }
}