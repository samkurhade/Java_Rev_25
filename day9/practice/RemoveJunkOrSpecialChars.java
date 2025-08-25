package day9.practice;

public class RemoveJunkOrSpecialChars {
    public static void main(String[] args) {

        String str = "Jav@#! ~wi%^&*th Sele^&%*&)(nium";

        System.out.println(str.replaceAll("[^a-zA-Z0-9]",""));

    }
}
