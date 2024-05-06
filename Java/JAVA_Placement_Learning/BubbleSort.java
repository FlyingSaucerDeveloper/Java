public class BubbleSort {

    public static void main(String[] args) {

        int arr[] = { 7, 8, 3, 1, 2 };

        // Bubble sort
        // Time Complexity = O(n2)
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }

            }

        }

        for (int i : arr) {
            System.out.print(i + " ");

        }

    }

}
