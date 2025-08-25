package day9.practice;

public class CheckPalindrome {
    public static void main(String[] args) {

        String str1 = "NayaN";
        String rev = "";

        for (int i = str1.length()-1; i >= 0; i--) {
            rev = rev + str1.charAt(i);
        }

        if (str1.equals(rev))
            System.out.println("Given String is palindrome");
        else
            System.out.println("Given String is not palindrome");



    }
}
