package day7.practice;

public class LargestAndLowestELeInArray {
    public static void main(String[] args) {
        int arr[] = {1,54,67,340,43,5421};

        int lowest = arr[0];
        int largest = arr[0];
        for (int i = 0; i < args.length; i++) {
            if (arr[i] < lowest)
                lowest = arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest)
                largest = arr[i];
        }


        System.out.println("Largest : "+largest +  " Lowest : "+lowest);

    }
}
