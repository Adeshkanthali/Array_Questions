package SelfPrograms.Array;

//............................................... Welly edge Code ..........................................//

import java.util.Scanner;

public class IndexValueSum {

    //............................................................................//
    public static int IndexSum(int arr[]){               //function declaration

        int even = 0;
        int odd = 0;

        for (int i=0; i<arr.length; i++){
            if (i%2 == 0){
                even += arr[i];
            }
            else {
                odd += arr[i];
            }
        }
        return Math.max(even,odd);
    }
    //............................................................................//

    public static void main(String[] args) {

        System.out.println("Enter length of Array :- ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the Elements of Array :- ");

        for (int i=0; i<arr.length; i++){           //Array input from user
            arr[i] = sc.nextInt();
        }

        int result = IndexSum(arr);                 //function call

        System.out.println("The Max Sum is :- " + result);
    }

}
