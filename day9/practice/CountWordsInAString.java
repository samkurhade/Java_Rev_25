package day9.practice;

import java.util.Arrays;

public class CountWordsInAString {
    public static void main(String[] args) {
        String s = "I am learning java";

        String a[] = s.split(" ");

        System.out.println(Arrays.toString(a));

        System.out.println("Word Count : "+a.length);

    }
}
