package day5;

public class ReverseANumber {

    public static void main(String[] args) {

        int num = 1052;
        int Rev=0;

        while (num != 0){
            Rev = Rev*10 + num%10;
            num = num / 10;
//            System.out.print(n);
        }
        System.out.println("Reversed Number is :" + Rev);
    }
}
