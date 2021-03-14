package PracticeJava;

import java.util.Stack;

public class parentheses {

    public static void main(String[] args) {
        String  s="([(])";
        Stack<Character> stack=new Stack<>();

        for (char c: s.toCharArray()) {

            if (c=='(' ||c=='[' || c=='{') {
                stack.push(c);
            }else if (c==')'  && !stack.isEmpty() && c=='(') {
                stack.pop();
            }else if (c==']'  && !stack.isEmpty() && c=='[') {
                stack.pop();
            }else if (c=='}'  && !stack.isEmpty() && c=='{') {
                stack.pop();
            }

        }

        System.out.println("stack = " + stack);


    }
}
