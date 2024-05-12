import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

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

    public static void subsequencePrinter(String string, int i, String ns) {

        // Base case
        if (i == string.length()) {

            System.out.println(ns);
            return;

        }

        char currChar = string.charAt(i);

        // If char wants to be added to the sequence
        subsequencePrinter(string, i + 1, ns + currChar);

        // if not
        subsequencePrinter(string, i + 1, ns);
    }

    public static void uniqueSubsequencePrinter(String str, int i, String ns, HashSet<String> hSet) {

        // Base Case
        if (i == str.length()) {

            if (hSet.contains(ns)) {
                return;
            } else {
                System.out.println(ns);
                hSet.add(ns);
                return;
            }

        }

        // if charAt(i) agrees
        char currChar = str.charAt(i);
        uniqueSubsequencePrinter(str, i + 1, ns + currChar, hSet);

        // if charAt(i) not agrees
        uniqueSubsequencePrinter(str, i + 1, ns, hSet);

    }

    public static void keypadCombinations(Object[] digitarr, Map keymap, String ns, int i) {
        // Base case
        if (i == digitarr.length) {
            System.out.println(ns);
            return;
        }

        int digit = (int) digitarr[i];
        String mapping = keymap.get(digit).toString();

        for (int x = 0; x < mapping.length(); x++) {

            keypadCombinations(digitarr, keymap, ns + mapping.charAt(x), i + 1);

        }

    }

    // Code to seprate digits from a number
    // Helper method for the keypadCombinations method
    public static TreeSet digitsFinder(int number, TreeSet s) {

        // Base case
        if ((number / 10) < 1) {
            TreeSet s1 = (TreeSet) s.descendingSet();
            System.out.println(s1);

            return s;
        }

        int n1 = 0, n2 = 0;
        if (number >= 10) {

            n1 = number / 10;
            n2 = number % 10;
            number = n1;
            if (n1 < 10) {
                s.add(n1);
            }
            if (n2 < 10) {
                s.add(n2);
            }

        } else {
            int temp = n1;
            n1 = number;
            number = n1;
            s.add(n1);

        }
        return digitsFinder(number, s);

    }

    @SuppressWarnings({ "unchecked", "rawtypes", "resource" })
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

        // Print all subsequences
        String string = "aabcc";
        System.out.println("Print all subsequences");
        subsequencePrinter(string, 0, "");
        System.out.println();

        // Print all unique subsequences
        String str = "aaa";
        System.out.println("Print all unique subsequences");
        uniqueSubsequencePrinter(str, 0, "", new HashSet<String>());
        System.out.println();

        // Print all the Keypad combinations
        Map keymap = new HashMap<Integer, String>();
        keymap.put(0, ".");
        keymap.put(1, "abc");
        keymap.put(2, "def");
        keymap.put(3, "ghi");
        keymap.put(4, "jkl");
        keymap.put(5, "mno");
        keymap.put(6, "pqr");
        keymap.put(7, "stu");
        keymap.put(8, "vwx");
        keymap.put(9, "yz");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the digit : ");
        int number = sc.nextInt();
        System.out.println("Print all the Keypad combinations for the number : " + number);
        Set digitSet = digitsFinder(number, new TreeSet<>());

        System.out.println(digitSet);
        Object[] digitarr = digitSet.toArray();
        keypadCombinations(digitarr, keymap, "", 0);

    }

}
