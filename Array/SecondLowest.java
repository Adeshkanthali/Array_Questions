package SelfPrograms.Array;

import java.util.Arrays;

public class SecondLowest {

    //.........................................................................//

    public static int SecondLower(int arr[]){
        Arrays.sort(arr);
        return arr[1];
    }

    //.........................................................................//

    public static void main(String[] args) {

        int arr[] = {50, 10, 30, 20, 40};

        int secondLowest = SecondLower(arr);

        System.out.println("Second Lowest Element is :- " + secondLowest);

    }
}
