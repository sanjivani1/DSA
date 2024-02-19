import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {

        int[] nums1 = {2 , 4};
        int[] nums2 = {1, 2, 3, 4};

        int[] result = nextGreaterElement(nums1, nums2);

        // Print the result
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int max;
        int[] result = new int[nums1.length];
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        for(int i =0;i<nums2.length;i++){
            s2.push(nums2[i]);
        }

        for(int i=0;i<nums1.length;i++){
            max = -1;
            while(!s2.isEmpty() && s2.peek() != nums1[i]){
                if(nums1[i] < s2.peek()){
                    max = s2.peek();
                    s1.push(s2.pop());
                }
                else{
                    s1.push(s2.pop());
                }
            }
            result[i] = max;

            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }
        return result;
    }
}
