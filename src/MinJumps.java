public class MinJumps {
    public static void main(String[] args) {

        int[] arr = {1,4,3,2,6,7};
        System.out.print("--> "+minJumps(arr));
    }

    static int minJumps(int[] arr){
        // your code here

        int i = 0;
        int count = 0;
        int n = arr.length;
        while(i < n ){

            if(arr[i] <= 0){
                return -1;
            }

            if((i+arr[i]) < n){
                i = i+ arr[i];
                count++;
            }
            else if((i+arr[i]) >= n){
                count++;
                break;
            }
        }
        return count;
    }
}
