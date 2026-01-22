import java.util.ArrayDeque;
import java.util.Deque;

public class MyStackUsingQueue {
    public static void main(String[] args){
//        ["MyStack", "push", "push", "top", "pop", "empty"]
//[[], [1], [2], [], [], []]
        MyStack obj = new MyStack();
        obj.push(1);
        obj.push(2);
        System.out.println(obj.top());
        System.out.println(obj.pop());
        System.out.println(obj.empty());
    }
}


class MyStack {

    Deque<Integer> deque = new ArrayDeque<>();
    public MyStack() {
    }

    public void push(int x) {
        deque.push(x);
        System.out.println(deque);
        System.out.println("null");
    }

    public int pop() {
        int i = deque.pop();
        return i;
    }

    public int top() {
        return deque.peek();
    }

    public boolean empty() {
        return deque.isEmpty();
    }
}