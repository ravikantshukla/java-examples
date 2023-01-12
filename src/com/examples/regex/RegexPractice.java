package com.examples.regex;

public class RegexPractice {
    public static void main(String[] args) {
        System.out.println("cat".matches("cat"));
        System.out.println("cat".matches("Cat"));
        System.out.println("bat".matches("[cC]at"));
        System.out.println("bat".matches("[cCb]at"));
        System.out.println("Bat".matches("[cCbB]at"));
        System.out.println("dat".matches("[a-f]at"));
        System.out.println("Dat".matches("[a-f]at"));
        System.out.println("gat".matches("[a-f]at"));
        System.out.println("Eat".matches("[a-fA-F]at"));
        System.out.println("cat".matches("[^c]at"));
        System.out.println("Cat".matches("[^c]at"));
        System.out.println("flat".matches("[^c]at")); // 3 char string
        System.out.println("lat".matches("[^a-z]at"));
    }
}
