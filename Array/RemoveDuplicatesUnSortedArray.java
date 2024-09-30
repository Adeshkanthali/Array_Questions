package SelfPrograms.Array;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicatesUnSortedArray {

    public static void main(String[] args) {

        int a[] = {9, 1, 2, 2, 7, 3, 3};

        //.........................................................................//
        Arrays.sort(a);

        int j = 0;

        for (int i = 0; i < a.length-1; i++){
            if (a[i] != a[i+1]){
                a[j] = a[i];
                j++;
            }
        }
        a[j] = a[a.length-1];

        for (int i=0; i<j+1; i++){
            System.out.print(a[i] + " ");
        }
        //.........................................................................//


        //..............................Using Hashset..............................//

//        HashSet<Integer> hs = new HashSet<>();

//        for (int i=0; i<a.length; i++){
//            hs.add(a[i]);
//        }
//
//        for (int n:hs){
//            System.out.print(n + " ");
//        }
        //.........................................................................//

    }
}
