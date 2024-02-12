package Chapter11_Collections;

import java.util.Stack;

public class Stack_Example {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        if(stack.empty()){
            System.out.println("stack이 비어 있습니다.");
        }
        else{
            System.out.println("stack이 비어있지 않습니다.");
        }

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println("stack의 최상단 데이터는 " + stack.peek() + "입니다.");
        stack.pop();
        System.out.println("stack의 최상단 데이터는 " + stack.peek() + "입니다.");
    }
}
