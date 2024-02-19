public class TwoSum {
    public static void main(String[] args) {
        int[] res = new int[2];
        int[] arr = {3,2,4};
        int target = 6;
        
        res = twoSum(arr , target);
        System.out.print(res[0]+" "+res[1]);
    }

    private static int[] twoSum(int[] nums, int target) {
        int  i = 0;
        int  j  = nums.length-1;
        int[] res = new int[2];
        int sum = 0;
        java.util.Arrays.sort(nums);
        while(i<nums.length || j>0){
            sum = nums[i] + nums[j];
            if(sum == target){
                res[0] = i;
                res[1] = j;
                break;
            }
            else if(sum > target){
                j--;
            }
            else {
                i++;
            }
        }
        return res;
    }
}
