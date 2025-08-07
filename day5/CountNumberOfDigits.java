package day5;

public class CountNumberOfDigits {
    public static void main(String[] args) {
        int num = 50214587, noOfDigits = 0;

        while(num!=0){
            num = num/10;
            noOfDigits++;
        }

        System.out.println("Number of digits in given number are "+ noOfDigits);
    }
}
