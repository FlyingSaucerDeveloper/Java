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
        char find = 'c';
        System.out.println("Find the 1st and last occurance of -" + find + "- in string : " + x);
        occurenceFinder(x, find, 0, -1, -1);
        System.out.println("\n");

        // check if the array is sorted (Strickly Increasing)
        System.out.println("check if the array is sorted (Strickly Increasing)");
        int xArr[] = { -1, 0, 2, 4, 5, 8 };
        sortChecker(xArr, 0);
        System.out.println("\n");

    }

}
