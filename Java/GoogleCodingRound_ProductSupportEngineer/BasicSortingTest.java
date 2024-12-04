public class BasicSortingTest {

    private static void insertionSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;

            }

            arr[j + 1] = key;

        }

        printArr(arr);
    }

    private static void selectionSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            int temp = i;

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[temp] > arr[j]) {

                    temp = j;
                }

            }

            int element = arr[i];
            arr[i] = arr[temp];
            arr[temp] = element;

        }
        printArr(arr);

    }

    private static void bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    arr[j] = arr[j] + arr[j + 1];
                    arr[j + 1] = arr[j] - arr[j + 1];
                    arr[j] = arr[j] - arr[j + 1];

                }

            }

        }

        printArr(arr);
    }

    static void printArr(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.println("\nArray Length : " + arr.length);
        System.out.println();

    }

    static void sort(int[] arr, String sortingType) {

        if (sortingType == "bbl") {
            bubbleSort(arr);
        }

        else if (sortingType == "sel") {
            selectionSort(arr);
        }

        else {
            insertionSort(arr);
        }

    }

    public static void main(String[] args) {
        int initArr[] = { 5, 2, 3, 1 };

        System.out.print("Initial Array : ");
        printArr(initArr);

        int[] arr = initArr;
        System.out.println();
        System.out.print("BubbleSort Array : ");
        sort(arr, "bbl");

        arr = initArr;
        System.out.println();
        System.out.print("SelectionSort Array : ");
        sort(arr, "sel");

        arr = initArr;
        System.out.println();
        System.out.print("InsertionSort Array : ");
        sort(arr, "ins");

    }
}
