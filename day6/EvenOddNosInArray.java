package day6;

public class EvenOddNosInArray {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        int sum = 0;
        for (int ele : a) {
            sum+=ele;
        }
        System.out.println(sum);
    }
}
