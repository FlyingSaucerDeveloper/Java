public class Recursion_Level1 {

    // A function that calls itself

    // Mostly used for Sorting, Trees and Graphs

    public static void printNum(int n) {
        if (n == 0) {
            return;
        }

        System.out.println(n);
        // Recurssive calls are done in stack memory
        printNum(n - 1);

    }

    public static void printSumNaturalNumbers(int n, int sumNaturalNumbers, int count) {

        if (n == 0) {
            System.out.println("Sum of first " + count + " natural numbers : " + sumNaturalNumbers);
            return;
        }

        sumNaturalNumbers = sumNaturalNumbers + n;
        count = count + 1;

        printSumNaturalNumbers(n - 1, sumNaturalNumbers, count);

    }

    public static void printFactorial(int n, int product, int count) {

        if (n == 0) {
            System.out.println("Factorial of " + count + " : " + product);
            return;
        }

        product = product * n;
        count++;

        printFactorial(n - 1, product, count);

    }

    private static void printFibbTillN(int n, int a, int b) {

        if (b > n) {
            return;
        }

        int c = a + b;

        System.out.print(c + " ");

        int temp = b;
        b = c;
        a = temp;

        printFibbTillN(n, a, b);

        // without swap :
        /*
         * printFibbTillN(n, b, c);
         */

    }

    public static void printXtoPowerN(int x, int n, int product) {

        if (n == 0) {
            System.out.println(product);
            return;
        }

        product = product * x;

        printXtoPowerN(x, n - 1, product);

    }

    private static int printXtoPowerNwihtStackHeightLogN(int x, int n) {

        if (n == 0) {
            return 1;
        }

        if (n % 2 == 0) {
            return printXtoPowerNwihtStackHeightLogN(x, n / 2) * printXtoPowerNwihtStackHeightLogN(x, n / 2);
        } else {

            return printXtoPowerNwihtStackHeightLogN(x, n / 2) * printXtoPowerNwihtStackHeightLogN(x, n / 2) * x;

        }
    }

    public static void main(String[] args) {

        // Print numbers 5 to 1.
        System.out.println("Print numbers 5 to 1");
        printNum(5);
        System.out.println();

        // Print sum of first n natural numbers
        System.out.println("Print sum of first n natural numbers");
        printSumNaturalNumbers(10, 0, 0);
        System.out.println();

        // Print the factorial of n
        System.out.println("Print the factorial of n");
        printFactorial(5, 1, 0);
        System.out.println();

        // Print fibonacci sequence total of n terms
        System.out.println("Print fibonacci sequence total of n terms");
        System.out.print(0 + " ");
        System.out.print(1 + " ");
        int n = 7;
        // a is the 2nd last term and b is last term
        printFibbTillN(n - 2, 0, 1);
        System.out.println();

        // Print x^n (stack height = n)
        System.out.println("\nPrint x^n (stack height = n)");
        int x = 2;
        n = 5;
        printXtoPowerN(x, n, 1);
        System.out.println();

        // Print x^n (stack height = logn)
        System.out.println("Print x^n (stack height = logn)");
        x = 2;
        n = 5;
        System.out.println(printXtoPowerNwihtStackHeightLogN(x, n));

    }

}
