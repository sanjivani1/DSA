import java.util.Stack;

public class SortAStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(-2);
        stack.push(9);
        stack.push(-7);
        stack.push(3);

        System.out.println(stack);
        sortStack(stack);
        System.out.println(stack);
    }
    public static void sortStack(Stack<Integer> stack) {
        // Write your code here.
        if (stack.size()>0) {
            int element = stack.pop();
            sortStack(stack);
            insertStack(stack, element);
        }
    }
    public static void insertStack(Stack<Integer> stack , int element){
        if(stack.size() == 0 || element > stack.peek() ) {
            stack.push(element);
        }
        else{
            int topElement = stack.pop();
            insertStack(stack, element);
            stack.push(topElement);
        }
    }
}
