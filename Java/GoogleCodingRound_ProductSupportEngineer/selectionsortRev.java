public class selectionsortRev {
    int[] sort(int arr[]){
        int idx = 0;

        for(int i =0; i< arr.length-1; i++){
            idx = i;

            for (int j= i+1; j<arr.length; j++){
                        if (arr[j]<arr[idx]){
                            idx = j;
                        }                                        
            }

            //swapping
            int temp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = temp;

        }

        return arr;

    }


    public static void main(String[] args) {
        int arr[] = {5, 3, 4, 6, 1, 2};

        arr = new selectionsortRev().sort(arr);

        for(int i : arr){
            System.out.println(i+" ");
        }
    }



}
