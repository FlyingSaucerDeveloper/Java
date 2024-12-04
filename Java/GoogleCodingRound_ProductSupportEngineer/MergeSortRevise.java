public class MergeSortRevise {

    int[] conquer(int[] left, int right[], int arr[]) {

        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] < right[j])
                arr[k++] = left[i++];
            else if (right[j] < left[i])
                arr[k++] = right[j++];

        }

        while (i < left.length) {
            arr[k++] = left[i++];
        }
        while (j < right.length) {
            arr[k++] = right[j++];
        }

        return arr;

    }

    int[] mergeSort(int arr[]) {

        // Array of one element cannot be divided.
        if (arr.length < 2)
            return null;

        // creating predefined Left and right arrays
        int midpoint = (arr.length - 1) / 2;
        int left[] = new int[midpoint + 1];
        int right[] = new int[arr.length - left.length];

        // Filling the arrays
        for (int i = 0; i < left.length; i++)
            left[i] = arr[i];
        for (int i = 0, j = left.length; i < right.length; i++, j++)
            right[i] = arr[j];

        // Dividing the arrays
        mergeSort(left);
        mergeSort(right);

        return conquer(left, right, arr);

    }

    public static void main(String[] args) {
        int arr[] = { 3, 6, 9, 2, 5, 8 };

        arr = new MergeSortRevise().mergeSort(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

}
