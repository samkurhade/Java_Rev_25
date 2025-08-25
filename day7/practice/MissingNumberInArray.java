package day7.practice;

public class MissingNumberInArray {
    public static void main(String[] args) {

        //Pre-conditions
        // Array should not contain duplicate values
        // Array values should be in range
        // No need to have sorted array

        int a[] = {1,9,3,4,10,8,7,2,5};

        // 1+2+4+5 = sum1
        // 1+2+3+4+5= sum2
        // missingNum = sum2-sum1 = 15-12 = 3

        int sum1=0,sum2=0;

        // to calculate sum1
        for (int i = 0; i < a.length; i++) {
            sum1 = sum1 + a[i];
        }

        // to calculate sum2 (from 1 to 10)
        for (int i = 1; i <= 10 ; i++) {
            sum2 = sum2 + i;
        }

        System.out.println("Missing Number is :" + (sum2 - sum1));
    }
}
