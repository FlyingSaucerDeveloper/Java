public class QuickSortRevision {
    

    int pivotpositionFinder(int[] arr, int begin, int end){
        int i = begin-1;
        
        int pivot = arr[end];

        for(int j = begin; j<end; j++){
            if (arr[j]<pivot){
                i++;

                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;

            }

        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[end] = temp;


        return i;
    }

    int[] quickSort(int arr[], int begin, int end){

        if (begin<end){

            int pidx = pivotpositionFinder(arr , begin, end);
            quickSort(arr, begin, pidx-1);
            quickSort(arr, pidx+1, end);

        }

        return arr;

    }


    public static void main(String[] args) {
            int arr[] = {2,5,3,6 ,1,4};

            arr =new QuickSortRevision().quickSort(arr, 0, arr.length-1);

            for (int i : arr){
                System.out.print(i+" ");
            }


    }
}
