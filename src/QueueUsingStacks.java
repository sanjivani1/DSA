import java.util.Stack;

public class QueueUsingStacks {
    public static void main(String[] args) {
        MyQueue q1 = new MyQueue();
        q1.push(1);
        q1.push(2);
        q1.peek();
        q1.pop();
        q1.empty();
    }
}

class MyQueue {
    Stack<Integer> s1 ;
    Stack<Integer> s2 ;
    public MyQueue() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    public void push(int x) {
        s1.push(x);
    }

    public int pop() {
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        int pop = s2.pop();
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
        return pop;
    }

    public int peek() {
        if(s1.isEmpty()){
            return -1;
        }
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        int pop = s2.peek();
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
        return pop;
    }

    public boolean empty() {
        if(s1.isEmpty()) return true;
        else return false;
    }
}
