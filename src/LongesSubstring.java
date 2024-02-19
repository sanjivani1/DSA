import java.util.HashSet;

public class LongesSubstring {
    public static void main(String[] args) {

        String s = " "; // Example string

        // Call the lengthOfLongestSubstring method and store the result
        int length = lengthOfLongestSubstring(s);

        // Print the result
        System.out.println("Length of longest substring: " + length);
    }
    public static int lengthOfLongestSubstring(String s) {

        HashSet<Character> set = new HashSet<>();
        int l = 0;
        int r = 0;
        int result = 1;
        for(int i = 0; i< s.length() ; i++){
            if(set.contains(s.charAt(i))){

                set.remove(s.charAt(l));
                l++;
                result = Math.max(result , (r-l)+1);
            }
            else{
                set.add(s.charAt(r));
                r++;
            }
        }
        return result;
    }
}
