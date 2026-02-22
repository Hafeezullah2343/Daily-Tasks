import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackUsingQueue {

    Queue<Integer> queue;
    StackUsingQueue(){
        queue = new LinkedList<>();
    }

    public void push(int x){
        queue.add(x);

        int size =  queue.size();
        for(int i =0; i<size-1; i++){
            queue.add(queue.remove());
        }
    }

    public int pop(){
        if(queue.isEmpty()){
            return -1;
        }
        return queue.remove();
    }

    public int peek(){
        if(queue.isEmpty()){
            return -1;
        }
        return queue.peek();
    }

    public boolean empty(){
        return queue.isEmpty();
    }
    public static void main(String[] args) {
        StackUsingQueue stack = new StackUsingQueue();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.pop());
    }
}
