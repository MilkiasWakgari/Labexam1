package Question2;

import java.util.Stack;

public class ques2 {
    public static void main(String[] args){
        Stack<Integer> stack= new Stack<>();
        stack.push(12);
        stack.push(60);
        stack.push(552);
        stack.push(7);
        stack.push(69);


        System.out.println("Top element: " + stack.peek());
        stack.pop();
        System.out.println("Top element after pop: " + stack.peek());
        System.out.println("Is the stack empty: " + stack.isEmpty());
        System.out.println("Stack size: " + stack.size());
    }
}


