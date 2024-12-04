public class SelectionSort {

    static int[] sort(int arr[]) {

        int temp = 0;
        int idx = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            idx = i;
            for (int j = i + 1; j < arr.length; j++) {
                System.out.println(arr[idx] + " vs " + arr[j]);
                if (arr[idx] > arr[j]) {
                    idx = j;
                }

            }

            System.out.println("arr[i] : " + arr[i] + "  arr[idx] : " + arr[idx]);
            temp = arr[idx];
            arr[idx] = arr[i];
            arr[i] = temp;

        }

        return arr;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 2, 3, 1 };

        System.out.print("Initial Array :");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        ;
        System.out.println();
        sort(arr);

        System.out.print("Sorted Array (Selection SORT) : ");
        for (int i : arr) {
            System.out.print(i + " ");
        }

    }

}
