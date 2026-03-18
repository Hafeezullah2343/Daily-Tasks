import java.util.Stack;

public class InfixToPostFix {

    public static int precedence(char symbol){

        switch(symbol){
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    public static String convert(String exp){

        Stack<Character> stack = new Stack<>();
        StringBuilder postfix = new StringBuilder();

        for(int i = 0; i < exp.length(); i++){

            char ch = exp.charAt(i);
            if (Character.isLetterOrDigit(ch)){
                postfix.append(ch);
            } else if (ch == '(') {
                stack.push(ch);
            }else if (ch == ')'){
                while(!stack.isEmpty() && stack.peek() != '('){
                    postfix.append(stack.pop());
                }
                stack.pop();
            }else {
                while (!stack.isEmpty() && precedence(ch) <= precedence(stack.peek())){
                    postfix.append(stack.pop());
                }
                stack.push(ch);
            }
        }
        while(!stack.isEmpty()){
            postfix.append(stack.pop());
        }
        return postfix.toString();
    }


    public static void main(String[] args) {
        String exp = "(A+B)*(C+D)/E+F*G)";
        System.out.println(convert(exp));
    }
}