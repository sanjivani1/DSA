public class MaxSubarraySum {
    public static void main(String[] args) {

        int[] arr = {1,2,3,-2,5};
        int n = arr.length;

        System.out.print("MaxSubarray = "+maxSubarraySum(arr, n));
    }

    private static Long maxSubarraySum(int[] arr , int n) {

        int i = 0 ;
        int j = 0 ;
        long max = Integer.MIN_VALUE;

        int sum = 0;
        while(i < n){
            sum = sum+arr[i];

            if(max < sum){
                max = sum;
            }
            if(sum < 0 ){
                sum = 0;
            }
            i++;
        }

        return max;
    }
}
