import java.util.Arrays;

public class MissingPositiveInteger {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5};
        int n = arr.length;
        System.out.println("Missing "+missing(arr , n));
//        for(int i=0 ; i< n ; i++){
//            if(arr[i] < 0){
//                arr[i] = Math.abs(arr[i]);
//            }
//            if(arr[i] == 0){
//                arr[i] = n+1;
//            }
//        }
//        for(int i=0 ; i< n; i++){
//
//            if(Math.abs(arr[i])-1 < n){
//                arr[Math.abs(arr[i])-1] -= (arr[arr[i]-1]) * 2;
//            }
//        }
//        int count =0;
//        for(int i =0 ; i< n ; i++){
//            if(arr[i] > 0 ){
//                System.out.print(i+1);
//                count = 1;
//                break;
//            }
//        }
//        if(count ==0 )
//            System.out.println(n+1);
    }

    private static Integer missing(int[] arr, int n) {
        int[] temp = new int[100];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > -1) {
                temp[arr[i]]++;
            }
        }
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] == 0) {
                return i;
            }
        }
        return 0;
    }
}
