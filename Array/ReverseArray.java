package SelfPrograms.Array;

public class ReverseArray {
    public static void main(String[] args) {

        int arr[] = {10, 30, 20, 50, 60};

        int n = arr.length;

        //...............................................................................//

        System.out.println("Revers Array is :- ");
        for (int i=n-1; i>=0; i--){
            System.out.print(arr[i] + " ");
        }

        //...............................................................................//

    }
}
