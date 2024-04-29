import java.util.Scanner;

class forloop {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of lines :");

        int n = sc.nextInt();

        // * Pattern

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print("*");

            }
            System.out.print("\n");

        }

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {

                System.out.print("*");

            }
            System.out.print("\n");

        }

        // Reverse * Pattern

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (int i = n; i >= 1; i--) {

            for (int k = 1; k <= n - i; k++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {

                System.out.print("*");

            }

            System.out.print("\n");

        }

        // Number Pattern

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print(j);

            }
            System.out.println();

        }

        for (int i = n; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }

        // Reversed Number Pattern

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {

                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {

                System.out.print(j);
            }
            System.out.println();

        }

        for (int i = n; i >= 1; i--) {

            for (int j = 1; j <= n - i; j++) {

                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {

                System.out.print(j);
            }
            System.out.println();

        }

        // Triangle * Pattern

        for (int i = 1; i <= n + 2; i++) {

            for (int j = 1; j <= (n + (n - i) - 1) / 2; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            for (int L = 1; L <= (n + (n - i) - 1) / 2; L++) {
                System.out.print(" ");
            }
            i = i + 1;
            System.out.println();

        }

        // Reversed Triangle * Pattern

        for (int i = n + 2; i >= 1; i--) {

            for (int j = 1; j <= (n + (n - i) - 1) / 2; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            for (int L = 1; L <= (n + (n - i) - 1) / 2; L++) {
                System.out.print(" ");
            }
            i = i - 1;
            System.out.println();

        }

        // Triangle Number Pattern

        for (int i = 1; i <= n + 2; i++) {

            for (int j = 1; j <= (n + (n - i) - 1) / 2; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }

            for (int L = 1; L <= (n + (n - i) - 1) / 2; L++) {
                System.out.print(" ");
            }
            i = i + 1;
            System.out.println();

        }

        // Reversed Triangle Number Pattern

        for (int i = n + 2; i >= 1; i--) {

            for (int j = 1; j <= (n + (n - i) - 1) / 2; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }

            for (int L = 1; L <= (n + (n - i) - 1) / 2; L++) {
                System.out.print(" ");
            }
            i = i - 1;
            System.out.println();

        }

        // Floyd's Triangle

        int temp = 1;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(temp + " ");
                temp++;
            }

            System.out.println();

        }

        // reversed Floyd's Triangle

        int temp2 = ((n * (n - 1)) / 2) + n;
        for (int i = n; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print(temp2 + " ");
                temp2--;
            }

            System.out.println();

        }

        // 0-1 Triangle pattern (My Way)

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {

                if ((j == i)) {
                    System.out.print(1);
                } else if ((j != i) && (i % 2 == 0) && (j % 2 == 0)) {
                    System.out.print(1);
                } else if ((i % 2 == 0) && (j % 2 != 0)) {
                    System.out.print(0);
                } else if ((i % 2 != 0) && (j % 2 == 0)) {
                    System.out.print(0);
                } else if ((j != i) && (i % 2 != 0) && (j % 2 != 0)) {
                    System.out.print(1);
                }
            }

            System.out.println();

        }

        // 0-1 Triangle pattern (Recommended way - Less Boiler code)

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {

                if ((i + j) % 2 != 0) {

                    System.out.print(0);

                } else {
                    System.out.print(1);
                }
            }

            System.out.println();

        }

    }

}