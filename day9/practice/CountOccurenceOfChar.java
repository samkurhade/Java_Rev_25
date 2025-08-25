package day9.practice;

public class CountOccurenceOfChar {
    public static void main(String[] args) {
        String s = "Programming";

        char trgChar = 'g';
        int count = 0;

        for (int i = 0; i < s.length();i++){
            if(s.charAt(i) == trgChar)
                count++;
        }

        System.out.println("Count of "+trgChar+" : "+count);



    }
}
