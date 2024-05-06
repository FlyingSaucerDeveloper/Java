public class SelectionSort {

    public static void main(String[] args) {

        int arr[] = { 7, 8, 3, 1, 2 };

        int smallest = 0;

        // Selection Sort
        // Time Compexity : O(n2)

        for (int i = 0; i < arr.length - 1; i++) {
            smallest = i;
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[smallest] > arr[j]) {
                    smallest = j;

                }

            }
            // Swap ( 1 swap per iteration)
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;

        }

        for (int i : arr) {
            System.out.print(i + " ");

        }

    }

}
