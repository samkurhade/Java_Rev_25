package day6;
public class SumOfArrEle {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,96,8};
        int even = 0 , odd = 0;
        for (int ele : a) {
            if (ele%2==0)
                even++;
            else
                odd++;
        }
        System.out.println("Even : "+even + " Odd : "+odd);
    }
}