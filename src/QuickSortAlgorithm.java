public class QuickSortAlgorithm {

    public static void main(String[] args) {
        int[] arr = {8,2,4,7,1,3,9,6,5};
        quickSort(arr, 0 ,arr.length-1);

        for(Integer i : arr){
            System.out.print(i);
        }
    }

    static void quickSort(int[] arr, int start, int end){

        if(end <= start) return;
        int pivot = partition(arr, start , end);

        quickSort(arr, start , pivot-1);
        quickSort(arr, pivot+1, end);

    }

    static int partition(int[] arr , int start , int end){

        int i = start-1;

        int pivot = arr[end];
        for(int j = start ; j < end ; j++){

            if(arr[j] <= pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[end];
        arr[end] = temp;

        return i;
    }
}
