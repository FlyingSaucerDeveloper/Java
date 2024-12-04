
public class BubbleSort {

    public static int[] sort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) { // i will not go to the last element, as its not required, 2nd last
                                                   // element will be compared to the last element
            System.out.println("Iteration : " + i);
            for (int j = 0; j < arr.length - i - 1; j++) {// j will alwaYS Iterate less than i as the last element
                                                          // sorted by the iteration need not to visit.

                if (arr[j] > arr[j + 1]) {

                    // swap
                    arr[j] = arr[j] + arr[j + 1];
                    arr[j + 1] = arr[j] - arr[j + 1];
                    arr[j] = arr[j] - arr[j + 1];

                }

            }

            for (int k : arr) {
                System.out.print(k + " ");
            }
            System.out.println();

        }

        return arr;
    }

    public static void main(String[] args) {
        int arr[] = { 7, 8, 3, 1, 2 };
        System.out.print("Initial Array :");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        ;
        System.out.println();
        sort(arr);

        System.out.print("Sorted Array (Bubble SORT) : ");
        for (int i : arr) {
            System.out.print(i + " ");
        }

    }

}
