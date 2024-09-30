package SelfPrograms.Array;

import java.util.Arrays;

class PrintDuplicates {

    public static void main(String[] args) {

        int a[] = {100, 20, 200, 40, 500, 50, 40, 200};

        //.........................................................................//

        Arrays.sort(a);

        int j = 0;

        for (int i=0; i<a.length-1; i++){
            if (a[i] == a[i+1]){
                a[j] = a[i];
                j++;
            }
        }

        if (j == 0){
            System.out.println("Array don't have Duplicate Value.");
        }
        else {
            System.out.println("Duplicate Values are :- ");
            for (int i = 0; i < j; i++) {
                System.out.print(a[i] + " ");
            }
        }

        //.........................................................................//

    }
}
