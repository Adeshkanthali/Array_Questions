package SelfPrograms.Array;

public class CountOfSpecialCharacters {

        public static int CountMethod(String str) {

            int count = 0;

            for (int i = 0; i < str.length(); i++) {

                char c = str.charAt(i);

                if (!Character.isLetterOrDigit(c)) {
                    count++;
                }

            }
            return count;
        }

        public static void main(String[] args) {

            String arr[] = {"Ades$h#@", "#&##@/", "Hello#$"};

            int totalCount = 0;

            for (int i = 0; i < arr.length; i++) {
                totalCount = totalCount + CountMethod(arr[i]);
            }

            System.out.println("Total special characters:- " + totalCount);
        }

}


