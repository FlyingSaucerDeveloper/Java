public class insertionSortRev {



int [] sort (int []arr){
    for (int i = 1; i<arr.length ; i++){

        int key =arr[i];

        int j = i-1;

        while(j>=0 && arr[j]>key){
            arr[j+1] = arr[j];
            j= j-1;
        }

        arr[j+1] = key;


    }
   return arr;
}


public static void main(String[] args) {
    int arr[] = {2,3,5,9,7,4,11,13};

    arr = new insertionSortRev().sort(arr);

    for (int i : arr){
        System.out.print(i+" ");
    }
}








    
}
