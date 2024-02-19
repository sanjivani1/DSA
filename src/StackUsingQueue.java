import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(1);
        stack.push(2);
        System.out.println(stack.top());
        System.out.println(stack.pop());
        System.out.println(stack.empty());
    }
}

class MyStack{
    Queue<Integer> q1 ;
    Queue<Integer> q2 ;
    public MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    public void push(int x) {
        q1.add(x);
        while(!q2.isEmpty()){
            q1.add(q2.remove());
        }
        while(!q1.isEmpty()){
            q2.add(q1.remove());
        }

    }

    public int pop() {
        return q2.remove();
    }

    public int top() {
        return q2.peek();
    }

    public boolean empty() {
        return q2.isEmpty();
    }
}
