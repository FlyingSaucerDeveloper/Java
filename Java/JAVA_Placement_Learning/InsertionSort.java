public class InsertionSort {

    public static void main(String[] args) {

        int arr[] = { 7, 8, 3, 1, 2 };

        for (int i = 1; i < arr.length; i++) {

            int current = arr[i]; // Since element at 0 will always be consider in the sorted array,
            // therefore our pointer in the unsorted array is at current.

            int j = i - 1;// j will used to compare the elements from the sorted array to the unsorted

            while (j >= 0 && current < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }

            // placement
            arr[j + 1] = current;

            for (int k : arr) {
                System.out.print(k + " ");
            }
            System.err.println();
        }

    }

}
