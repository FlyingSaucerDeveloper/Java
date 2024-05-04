public class AdvancedPatterns {

    public static void main(String[] args) {

        int n = 9;

        // Butterfly pattern

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }

            for (int k = 1; k <= 2 * (n - i); k++) {
                System.out.print(" ");

            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }

            System.out.println();

        }

        for (int i = n; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }

            for (int k = 1; k <= 2 * (n - i); k++) {
                System.out.print(" ");

            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }

            System.out.println();

        }

        // Parallelogram Pattern

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");

            }

            for (int k = 1; k <= n; k++) {
                System.out.print("*");
            }

            System.out.println();

        }

        // print 1 once , 2 twice, 3 thrice , so on on a pyramid.

        for (int i = 1; i <= n; i++) {

            for (int k = 1; k <= n - i; k++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {

                System.out.print(i);

                for (int L = 1; L <= i - 1; L++) {
                    System.out.print(" ");
                    break;
                }

            }

            for (int k = 1; k <= n - i; k++) {
                System.out.print(" ");
            }
            System.out.println();

        }

        // Palindromic Number Pyramid

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {

                for (int m = i; m >= 1; m--) {
                    System.out.print(m);
                }

                for (int m = 2; m <= i; m++) {

                    System.out.print(m);
                }
                break;
            }

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            System.out.println();

        }

        // Rombus or Diamond Pattern

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {

                System.out.print("*");
            }
            for (int k = 1; k <= i - 1; k++) {

                System.out.print("*");
            }

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            System.out.println();

        }

        for (int i = n; i >= 1; i--) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {

                System.out.print("*");
            }
            for (int k = 1; k <= i - 1; k++) {

                System.out.print("*");
            }

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            System.out.println();

        }

    }

}
