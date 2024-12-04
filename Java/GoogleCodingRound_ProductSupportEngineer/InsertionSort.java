
public class InsertionSort {

    static int[] sort(int[] arr) {

        for (int i = 1; i< arr.length; i++){
            int current = arr[i];
           int j = i-1;
            while (j>=0 && current<arr[j]){

                arr[j+1]=arr[j];
                j= j-1;
           

            }
           arr[j+1] = current;
        }

        return arr;
    }

    public static void main(String[] args) {
        int arr[] = { 7, 3, 1, 2 };
        System.out.println("Initial Array : ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
 
        
        sort(arr);

        System.out.println("Sorted Array : ");
        for (int i : arr) {
            System.out.print(i + " ");
        }



    }

}
