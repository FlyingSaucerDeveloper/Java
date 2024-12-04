public class Quick_Merge_Selection_InsertionSORT {

    public static void main(String[] args) {
        int arr[] = { 9, 4, 8, 2, 1 };

        Quick_Merge_Selection_InsertionSORT obj = new Quick_Merge_Selection_InsertionSORT();

        System.out.print("Quick Sorted Array: ");
        for (int i : obj.quickSort(arr, 0, arr.length - 1)) {
            System.out.print(i + " ");
        }

        int arr2[] = { 9, 4, 8, 2, 1 };
        System.out.print("\nMerge Sorted Array : ");

        for (int i : obj.mergeSort(arr2)) {
            System.out.print(i + " ");
        }

        int arr3[] = { 5, 2, 3, 1 };
        System.out.print("\nSelection Sorted Array : ");

        for (int i : obj.selectionSort(arr3)) {
            System.out.print(i + " ");
        }

        int arr4[] = { 5, 2, 5, 3, 1 };
        System.out.print("\nInsertion Sorted Array : ");

        for (int i : obj.insertionSort(arr4)) {
            System.out.print(i + " ");
        }

    }

    //// Quick Sort
    public int pivotPosition(int[] arr, int begin, int end) {
        int i = begin - 1;
        int pivot = arr[end];

        for (int j = begin; j < end; j++) {
            if (arr[j] < pivot) {

                i++;

                // Swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

        }
        // This code helps to find the exact position of the pivot.
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[end] = temp;

        return i;
    }

    public int[] quickSort(int[] arr, int begin, int end) {

        if (begin < end) {

            int pidx = pivotPosition(arr, begin, end);
            quickSort(arr, begin, pidx - 1);
            quickSort(arr, pidx + 1, end);

        }

        return arr;
    }

    //// Merge Sort
    public int[] conqer(int[] left, int[] right, int[] arr) {

        int L = 0, R = 0, idx = 0;

        while (L < left.length && R < right.length) {
            if (left[L] < right[R]) {
                arr[idx++] = left[L++];
            } else if (left[L] > right[R]) {
                arr[idx++] = right[R++];
            }
        }

        while (L < left.length) {
            arr[idx++] = left[L++];
        }
        while (R < right.length) {
            arr[idx++] = right[L++];
        }

        return arr;
    }

    public int[] mergeSort(int[] arr) {

        if (arr.length < 2)
            return null;

        int midpoint = (arr.length - 1) / 2;

        // initializing Left and right arr
        int left[] = new int[midpoint + 1];
        int right[] = new int[arr.length - left.length];

        // filling left and right array
        for (int i = 0; i < left.length; i++) {
            left[i] = arr[i];
        }

        for (int i = 0, j = midpoint + 1; i < right.length; i++, j++) {
            right[i] = arr[j];
        }

        // DIVIDE
        mergeSort(left);
        mergeSort(right);

        // Conqer
        conqer(left, right, arr);

        return arr;
    }

    //// SELECTION SORT - to test uf array is array is already sorted or if you have
    //// limited memory
    // Select the smallest element add to front of the arr.
    public int[] selectionSort(int arr[]) {

        int smallidx = 0;

        // finding the smallest element and puttin it in the left side.
        for (int j = 0; j < arr.length - 1; j++) {
            smallidx = j;

            for (int i = j + 1; i < arr.length; i++) {
                if (arr[i] < arr[smallidx]) {
                    smallidx = i;

                }

            }
            // Put smallest element in first

            // if (arr[j]>smallestElement){
            int temp = arr[smallidx];
            arr[smallidx] = arr[j];
            arr[j] = temp;

        }

        return arr;

    }

    //// INSERTION SORT
    public int[] insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {

            int j = i - 1;
            int curr = arr[i];

            while (j >= 0 && arr[j] > curr) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = curr;
        }

        return arr;
    }

}
