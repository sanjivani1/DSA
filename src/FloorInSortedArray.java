public class FloorInSortedArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,8,10,10,12,19};
        int x = 13;
        int i = 0;
        int j = arr.length;
        int mid ;
        while(i <= j){
            mid = (i + j)/2;

            if(arr[mid]+1 == x){
                System.out.println(arr[mid]);
                break;
            }
            else if(arr[mid]>x){
                j = mid-1;
            }
            else if(arr[mid]<x){
                i = mid+1;
            }
        }
    }
}
