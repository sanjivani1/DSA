import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class NextSmaller {
    public static void main(String[] args) {
        Main main = new Main();
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList());
        ArrayList<Integer> output = prevSmaller(input);
        System.out.println("Input: " + input);
        System.out.println("Output: " + output);
    }
    public static ArrayList<Integer> prevSmaller(ArrayList<Integer> A) {
        Stack<Integer> s1 = new Stack<>();
        ArrayList<Integer> result = new ArrayList<>();
        for(Integer i : A){
            if(s1.isEmpty()){
                result.add(-1);
                s1.push(i);
            }
            else if(i> s1.peek()){
                result.add(s1.peek());
                s1.push(i);
            }
            else{
                while(!s1.isEmpty()){
                    if(i > s1.peek()) break;
                    s1.pop();
                }
                if(s1.isEmpty())
                    result.add(-1);
                else result.add(s1.peek());
                s1.push(i);
            }
        }

        return result;
    }
}
