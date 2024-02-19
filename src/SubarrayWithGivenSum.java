import java.util.HashMap;


public class SubarrayWithGivenSum {

    public static void main(String[] args) {
        int[] A = {15,-2,2,-8,1,7,10,23}; // Example array
        int n = A.length; // Length of the array

        // Call the maxLen method from the SubarrayWithGivenSum class
        int maxLength = SubarrayWithGivenSum.maxLen(A, n);

        // Print the result
        System.out.println("Maximum length: " + maxLength);
    }
    static int maxLen(int A[], int n)
    {
        // Your code here
        HashMap<Integer, Integer> mpp = new HashMap<Integer, Integer>();

        int maxi = 0;
        int sum = 0;

        for(int i = 0;i<n;i++) {

            sum += A[i];

            if(sum == 0) {
                maxi = i + 1;
            }
            else {
                if(mpp.get(sum) != null) {

                    maxi = Math.max(maxi, i - mpp.get(sum));
                }
                else {

                    mpp.put(sum, i);
                }
            }
        }
        return maxi;
    }
}
