public class QuickSort {

    static int pivotPosition(int[] arr, int begin, int end) {
        int pidx = 0;
        int pivot = arr[end];
        int i = begin-1 ;

        for (int j = begin; j < end; j++) {

            if (arr[j] < pivot) {
                i = 1 + i;

                // swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

        }


        // Swaping Pivot
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[end] = temp;

        pidx = i;
        return pidx;

    }

    public static void sort(int[] arr, int begin, int end) {

        if (begin < end) {

            int pidx = pivotPosition(arr, begin, end);
            sort(arr, begin, pidx - 1);
            sort(arr, pidx + 1, end);

        }

    }

    public static void main(String[] args) {
        int[] arr = { 6, 3, 5, 9, 2, 8 };

        sort(arr, 0, arr.length - 1);

        for (int i : arr) {
            System.out.print(i + " ");
        }

    }

}
