package day5;

public class PallindromeNUmber {

    public static void main(String[] args) {
        int num = 1234  , num2 = num;
        int Rev=0;

        while (num != 0) {
            Rev = Rev * 10 + num % 10;
            num = num / 10;
        }

        System.out.println("Number after reversing : " +Rev);

        if(num2 == Rev)
            System.out.println("Given number "+num2 + " is Palindrome" );
        else
            System.out.println("Not Palindrome");
    }
}
