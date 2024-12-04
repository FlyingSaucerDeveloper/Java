public class Arrays {

    static int[] getPrefixSum(int arr[]) {
        int sum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            sum = sum + arr[i];
            arr[i] = sum;

        }
        return arr;

    }

    static int getSum(int i, int j, int arr[]) {
        int sum = 0;

        if (i != 0)
            sum = arr[j] - arr[i - 1];

        else
            sum = arr[j];

        return sum;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 2, 7, 5, 9, 6, 2 };

        int subArrSize = 3;

        arr = getPrefixSum(arr);
        System.out.print("Prefix Sum Arr : ");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        int i = 0, j = subArrSize - 1;
        int sum = 0;
        while (j <= arr.length - 1) {

            sum = Math.max(sum, getSum(i, j, arr));
            i++;
            j++;

        }
        System.out.println("\nMaximun Sum of the sum array is  : " + sum);

    }


}
