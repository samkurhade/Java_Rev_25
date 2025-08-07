package day5;

public class CountEvensAndOddNumbers {
    public static void main(String[] args) {
        int num = 12154;
        int even =0 , odd = 0;
        while (num!=0){
            int digit = num % 10;
            if (digit%2 == 0)
                even++;
            else
                odd++;
            num = num / 10;
        }
        System.out.println("Even : " + even);
        System.out.println("Odd : " + odd);


    }
}
