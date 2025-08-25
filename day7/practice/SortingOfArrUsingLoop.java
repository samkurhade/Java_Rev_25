package day7.practice;

import java.util.Arrays;

public class SortingOfArrUsingLoop {
    public static void main(String[] args) {
        int arr[] = {50,20,40,10,100};

        for (int i = 0; i < arr.length-1; i++) // NUmber of passes
        {

            for (int j = 0; j < arr.length - 1; j++)  // Iterations in each pass
            {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }

            }
        }
        System.out.println("After sorting : "+ Arrays.toString(arr));

    }
}
