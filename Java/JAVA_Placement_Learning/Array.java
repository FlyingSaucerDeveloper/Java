import java.util.Scanner;

public class Array {

    public static void main(String[] args) {

        // Take an 1-D array as input from the user, and search for a number provided by
        // user in it and also print the index at which ot occurs.

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of Array : ");
        int arrSize = sc.nextInt();

        int arrNums;
        int numArray[] = new int[arrSize];

        for (int i = 0; i < arrSize; i++) {
            System.out.print("Enter number " + (i + 1) + " : ");
            arrNums = sc.nextInt();
            numArray[i] = arrNums;
            System.out.println();
        }

        int x;
        System.out.print("Enter the number to search : ");
        x = sc.nextInt();
        int count = 0;

        for (int i = 0; i < numArray.length; i++) {
            if (x == numArray[i]) {
                System.out.println("Number " + x + " found at index " + (i + 1));
                count = 1;
            }
        }

        if (count == 0) {

            System.out.println("Number " + x + " does not exist in array");
        }

        // Take an 2-D array as input from the user, and search for a number provided by
        // user in it and also print the index at which ot occurs.

        System.out.println("Enter number of Rows : ");
        int rows = sc.nextInt();

        System.out.print("Enter the number of columns : ");
        int cols = sc.nextInt();

        int num;
        int numArrayo[][] = new int[rows + 1][cols + 1];

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {

                System.out.println("Enter number at row x col  : " + i + " x " + j + ": ");
                num = sc.nextInt();
                numArrayo[i][j] = num;

            }

        }

        int xo;
        System.out.print("Enter the number to search : ");
        xo = sc.nextInt();
        int counto = 0;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                if (xo == numArrayo[i][j]) {
                    System.out.println("Number " + xo + " found at index " + i + " x " + j);
                    counto = 1;
                }
            }

        }
        if (counto == 0) {

            System.out.println("Number " + xo + " does not exist in 2-D array");
        }

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {

                System.out.print(numArrayo[i][j] + " ");

            }
            System.out.println();
        }
    }

}
