package DSA;

import java.util.Stack;

public class LessonStack {
    public static void main(String[] args) {
        String s = "({}[])";
        System.out.println(checkValid(s));
    }
    public static boolean checkValid(String s){
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
                stack.push(s.charAt(i));
            }
            if (s.charAt(i) == ')'){
                if (stack.empty() || stack.peek() != '('){
                    return false;
                } else {
                    stack.pop();
                }
            }
            if (s.charAt(i) == ']'){
                if (stack.empty() || stack.peek() != '['){
                    return false;
                } else {
                    stack.pop();
                }
            }
            if (s.charAt(i) == '}'){
                if (stack.empty() || stack.peek() != '{'){
                    return false;
                } else {
                    stack.pop();
                }
            }
        }
        if (stack.size() > 0){
            return false;
        } else {
            return true;
        }
    }
}
