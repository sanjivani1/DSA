import java.util.ArrayList;
import java.util.List;

public class FourSum {
    public static void main(String[] args) {

        int[] nums = {1, 0, -1, 0, -2, 2}; // Example array
        int target = 0; // Example target

        // Call the fourSum function and store the result
        List<List<Integer>> result = fourSum(nums, target);

        // Print the result
        System.out.println("Result: " + result);

    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        int sum = 0;
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> subResult = new ArrayList<>();

        for(int  i = 0 ; i< nums.length ; i++){
            if( i> 0 && nums[i] == nums[i-1]) continue;
            for(int j = i+1 ; j< nums.length ; j++){
                if(j!=i+1 && nums[j] == nums[j-1]) continue;
                int k = j+1;
                int l = nums.length-1;
                while(k <= l){
//                    if(k>j+1 && nums[k] != nums[k-1]) continue;

//                    if(l<nums.length-1 && nums[l] != nums[l+1]) continue;

                    sum = nums[i] + nums[j] + nums[k] + nums[l];

                    if(sum == target){

                        subResult.add(nums[i]);
                        subResult.add(nums[j]);
                        subResult.add(nums[k]);
                        subResult.add(nums[l]);
                        result.add(subResult);
                        k++;
                        l--;
                        while(k < l && nums[k] == nums[k-1]) k++;
                        while(k<l && nums[l] == nums[l+1]) l--;
                    }

                    if(sum > target) l--;

                    else k++;
                }
//                result.add(subResult);
            }
        }
        return result;
    }
}
