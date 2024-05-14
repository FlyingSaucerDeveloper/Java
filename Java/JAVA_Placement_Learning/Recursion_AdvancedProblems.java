public class Recursion_AdvancedProblems {

    public static void permutationsPrinter(String s, String ns) {

        if (s.length() == 0) {
            System.out.println(ns);
            return;
        }

        for (int i = 0; i < s.length(); i++) {

            char currChar = s.charAt(i);

            // "abc" => "ab"

            String temp = s.substring(0, i) + s.substring(i + 1);

            // ns = ns+currChar;

            permutationsPrinter(temp, ns + currChar);

        }

    }

    public static int pathCalculator(int n, int m, int j, int k, int count) {
        if (k == m - 1 && j == n - 1) {
            // System.out.println(j + " , " + k);
            return 1;
        } else {
            int t1 = 0, t2 = 0;
            // Want to move right
            if (k != m - 1) {
                // System.out.println(j + " , " + k);
                t1 = pathCalculator(n, m, j, k + 1, count);
            }

            // Want to move down
            if (j != n - 1) {
                // System.out.println(j + " , " + k);
                t2 = pathCalculator(n, m, j + 1, k, count);
            }
            return t1 + t2;
        }

    }

    public static int tilePlacer(int n, int m) {

        // if n==m, either all the tiles can go vertical or only horizontal, therefore 2
        // ways only.
        if (n == m) {
            return 2;
        }

        // Only placement is Horizontal, therefore only 1 way
        if (n < m) {
            return 1;
        }

        // tile is horizontal
        int horWay = tilePlacer(n - m, m);

        // tile is vertical
        int verWay = tilePlacer(n - 1, m);

        return verWay + horWay;

    }

    public static int guestInviter(int guests) {

        if (guests<=1){
            return 1;
        }

        // if a single guest is called
        int sWay = guestInviter(guests-1);

        // if a pair is invited
        int pWay = (guests-1)*guestInviter(guests-2);

        return sWay+pWay;
        
    }

    public static void main(String[] args) {

        // All permutations of a string - Real life Probles : Seating the students on a
        // chairs
        // Time Complexity - O(n!)
        String s = "abc";
        System.out.println("Print all possible combinations of letters in a string : " + s);
        permutationsPrinter(s, "");
        System.out.println();

        // Count total paths in a maze to move from (0,0) to (n,m)
        // Condition 1 - Move only in right
        // Condition 2 - Move only downward
        int n = 3;
        int m = 3;
        System.out.print("Total paths from 0,0 to " + n + "," + m + " are: ");
        System.out.print(pathCalculator(n, m, 0, 0, 1));
        System.out.println("\n");

        // Tiling Problem
        // Place the tiles of 1 X m in a floor of size n X m
        n = 4;
        m = 2;
        System.out.println("Total ways to place the tiles of size 1 x "+n+" for the floor size of "+n+" x "+m+" are : " + tilePlacer(n, m));
        System.out.println();

        //Find the number of ways in which you can invite n people to you partym single or in pairs.
        int totalGuests = 4;
        System.out.println("Number of ways to invite "+totalGuests+" are : "+ guestInviter(totalGuests));
        System.out.println();

    }

}
