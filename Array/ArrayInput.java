package SelfPrograms.Array;

import java.util.Scanner;

public class ArrayInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size of Array :- ");
        int n = sc.nextInt();

        System.out.println("Enter Array Elements :- ");
        int arr[] = new int[n];

        //....................................................................................//
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Output Array is :- ");

        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        //....................................................................................//

    }
}
