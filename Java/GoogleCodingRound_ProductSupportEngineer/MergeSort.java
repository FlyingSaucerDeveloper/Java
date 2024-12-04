

public class MergeSort {

    public  int[] conqer(int[] left, int[] right, int[] arr) {

        int k = 0, j = 0, i = 0;

        //increment i if i is smaller else increment j - and increment k to traverse and update initial array
        while (i < left.length && j < right.length) {

            if (left[i] < right[j]) {
                arr[k++] = left[i++];
            } else
                arr[k++] = right[j++];

        }


        // Below Whiles are used to push the left over elements in each array into to initial arr.
        while (i < left.length) {

            arr[k++] = left[i++];

        }
        while (j < right.length) {

            arr[k++] = right[j++];

        }
        return arr;

    }

    public int[] mergeSort(int[] arr) {

        // if the arr has only one element, no further divide is required
        if (arr.length < 2)
            return null;

        int midpoint = (arr.length - 1) / 2;

        // create two arrays of predefiend length
        int[] left = new int[midpoint + 1];
        int[] right = new int[arr.length - left.length];

        // Filling the arrays
        for (int i = 0; i < left.length; i++) {
            left[i] = arr[i];
        }
        for (int i = 0, j = midpoint + 1; i < right.length; i++, j++) {
            right[i] = arr[j];
        }

        // DIVIDE
        // Further dividing each left and right array
        mergeSort(left);
        mergeSort(right);

        // CONQER
        // Sorting, merging and updating the existing (initial) array
        return conqer(left, right, arr);

         
    }

    public static void main(String[] args) {
        int[] arr = {5,6,1,3,2,4};

        arr = new MergeSort().mergeSort(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }

    //    new MergeSort().test();

    }


     

}
