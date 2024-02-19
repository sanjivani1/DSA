public class CommonElement {
    public static void main(String[] args) {
        int[] arr = {1,3,9};
        int[] brr = {2,3,3,56};

        int n = arr.length;

        int i = 0;
        int j = 0;
        int temp = -1;

        while( i < n && j < n){

            if(arr[i] < brr[j]){
                i++;
            }else if(arr[i] > brr[j]){
                j++;
            }
            else if(arr[i] == brr[j]){
                if(temp != arr[i]){
                    temp = arr[i];
                    System.out.println(arr[i]);
                }
                i++;
                j++;
            }
        }

    }
}
