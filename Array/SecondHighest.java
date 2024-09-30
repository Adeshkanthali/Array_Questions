package SelfPrograms.Array;

import java.util.Arrays;

public class SecondHighest {

    //...............................................................................//

    public static int SecondLarge(int arr[]){
        Arrays.sort(arr);
        int n = arr.length;
        return arr[n-2];
    }

    //...............................................................................//

    public static void main(String[] args) {

        int arr[] = {40, 55, 20, 70, 10};

        int secondLargest = SecondLarge(arr);

        System.out.println("Second Largest Element is :- " + secondLargest);
    }
}
