import java.util.Arrays;

public class Recursion_Level1_9Problems {

    public static void towerOfHanoi(int disc, String src, String helper, String Destination) {

        // Base case
        if (disc == 1) {

            System.out.println("Disc " + disc + " Transfered from " + src + " to " + Destination);

            return;

        }

        towerOfHanoi(disc - 1, src, Destination, helper); // helper tower became destination and destination is used as
                                                          // helper

        System.out.println("Disc " + disc + " Transfered from " + src + " to " + Destination);

        towerOfHanoi(disc - 1, helper, src, Destination); // sending the discs from helper to destination using src as
                                                          // helper

    }

    public static void stringReverser(String x, int l) {

        if (l < 0) {
            return;
        }

        System.out.print(x.charAt(l));
        stringReverser(x, l - 1);

    }

    public static void occurenceFinder(String x, char find, int i, int firstPosition, int temp) {

        if (i >= x.length()) {
            System.out.println("Last position of " + find + " is at index : " + temp);
            return;
        }

        if (firstPosition == -1) {

            if (x.charAt(i) == find) {
                System.out.println("First position of " + find + " is  at index : " + i);
                firstPosition = i;
            }

        }

        if (firstPosition != -1) {

            if (x.charAt(i) == find) {
                temp = i;
            }

        }
        occurenceFinder(x, find, i + 1, firstPosition, temp);

    }

    public static void sortChecker(int x[], int i) {

        if (i == x.length - 1) {
            System.out.println("Array is sorted");
            return;
        }

        if (x[i] < x[i + 1]) {
            sortChecker(x, i + 1);
        } else {
            System.out.println("Array is not Sorted");
            return;
        }

    }

    public static void elementMover(String s, int l, char element, int i, String ns, int count) {

        // base case
        if (i == l) {
            int j = 0;
            while (j < count) {
                ns = ns + element;
                j++;

            }
            System.out.println("Final String : " + ns + " and string lenght is : " + ns.length());
            return;
        }

        if (s.charAt(i) != element) {

            ns = ns + s.charAt(i);
        }

        else {
            count++;
        }

        elementMover(s, l, element, i + 1, ns, count);

    }

    public static void dupRemover(String s, int i, int j, String ns, String[] arr) {

        if (i == s.length() - 1) {
            System.out.println("Final String : " + ns);
            return;

        }

        /*
         * Arrays.asList(yourArray).contains(yourValue)
         * Warning: this doesn't work for arrays of primitives
         * 
         */

        // reference :
        // https://stackoverflow.com/questions/1128723/how-do-i-determine-whether-an-array-contains-a-particular-value-in-java

        if (!(Arrays.stream(arr).anyMatch((s.charAt(i) + "")::equals))) {
            if (s.charAt(i) != s.charAt(j)) {

                ns = ns + s.charAt(i);

                arr[i] = s.charAt(i) + "";
            }
        }

        dupRemover(s, i + 1, j + 1, ns, arr);

    }

    public static void main(String[] args) {

        // Tower of Hanoi
        // Time compexity : O(2^n)
        System.out.println("Tower of Hanoi");
        int disc = 4;
        towerOfHanoi(disc, "src", "helper", "Destination");
        System.out.println();

        // String reverse
        System.out.println("String reverse");
        String x = "Kartik";
        System.out.print("Reversed String : ");
        stringReverser(x, x.length() - 1);
        System.out.println("\n");

        // Find the 1st and last occurance of an element in string
        x = "baabcdafghbb";
        char find = 'a';
        System.out.println("Find the 1st and last occurance of -" + find + "- in string : " + x);
        occurenceFinder(x, find, 0, -1, -1);
        System.out.println("\n");

        // check if the array is sorted (Strickly Increasing)
        System.out.println("check if the array is sorted (Strickly Increasing)");
        int xArr[] = { -1, 0, 2, 4, 5, 8 };
        sortChecker(xArr, 0);
        System.out.println();

        // move all elements to the end of the string
        String s = "axbcxxd";
        char element = 'x';
        System.out.println("move element(s) --" + element + "-- to the end of the string : " + s);
        elementMover(s, s.length(), element, 0, "", 0);
        System.out.println();

        // Remove duplicates from the string
        String sO = "Kartik Sharma";
        System.out.println("Remove the duplicates from the string : " + sO);
        String[] arr = new String[sO.length()];
        dupRemover(sO.toLowerCase(), 0, 1, "", arr);
        System.out.println();

    }

}
