import java.util.Stack;

public class ValidateStackSequences {

    public static boolean isValid(int pushed[] , int popped[]) {

        Stack<Integer> stack = new Stack<>();
        int j = 0;

        for(int i : popped){
            stack.push(i);

            while(!stack.isEmpty() && stack.peek() == pushed[j]){
                stack.pop();
                j++;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        int[] pushed = {1,2,3,4};
        int[] popped = {4,3,2,1};

        System.out.println(isValid(pushed, popped));
    }
}
