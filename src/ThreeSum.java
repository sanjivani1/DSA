import java.util.ArrayList;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};  // -4, -1, -1, 0, 1, 2

        List<List<Integer>> result = threeSum(nums);

        // Print the result
        for (List<Integer> triplet : result) {
            System.out.println(triplet);
        }
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        java.util.Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        int sum ;
        int j ;
        int k ;
        for(int i = 0 ; i< nums.length ; i++){
            while (i + 1 < nums.length && nums[i] == nums[i + 1])
                i++;
            j = i+1;
            k = nums.length-1;
            while(j<k){
                sum = nums[i]+nums[j]+nums[k];
                if(sum == 0){
                    List<Integer> res = new ArrayList<>();
                    res.add(nums[i]);
                    res.add(nums[j]);
                    res.add(nums[k]);
                    result.add(res);
                    while (j + 1 < k && nums[j] == nums[j + 1])
                        j++;
                    j++;
                }
                else if(sum < 0){
                    while (j + 1 < k && nums[j] == nums[j + 1])
                        j++;
                    j++;
                }
                else if(sum > 0) {
                    while (k - 1 > j && nums[k] == nums[k - 1])
                        k--;
                    k--;
                }
            }
        }
        return result;

    }
}
