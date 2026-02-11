import java.util.Stack;

public class ValidParenthesis {

    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            // If opening bracket → push
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            }

            // If closing bracket
            else {

                // If stack empty → invalid
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                // Check matching types
                if (c == ')' && top != '(') return false;
                if (c == ']' && top != '[') return false;
                if (c == '}' && top != '{') return false;
            }
        }

        // If stack empty → valid
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String str = "([{}])";
        ValidParenthesis vp = new ValidParenthesis();
        System.out.println(vp.isValid(str));
    }
}
