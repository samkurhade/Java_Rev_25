package day9.practice;

import java.util.Arrays;

public class CountWordsInAString {
    public static void main(String[] args) {
        String s = "I am learning java ";

        // Remove leading/trailing spaces and split on one or more whitespace
        String a[] = s.trim().split("\\s+");

        System.out.println(Arrays.toString(a));

        System.out.println("Word Count : " + a.length);


        // Without using Predefined functions

        String s1 = "I am learning   java ";

        int wrdcnt = 0;

        for (int i = 0; i <= s1.length() - 1 ; i++) {

            if( s1.charAt(i) == ' ' && i > 0 && s1.charAt(i-1) != ' '){
                wrdcnt+=1;
            }
            // TO handle last word. There are two possible cases--
            // 1."I am learning java "
            // 2."I am learning java"

        }
        if (s1.length() > 0 && s1.charAt(s1.length()-1) != ' ')
            wrdcnt+=1;

        System.out.println("Total Words : "+wrdcnt);


    }
}
