package No3;

import java.util.Stack;

/**
 * Description: This is a tool to reverse the stack with recursion.<br/>
 * Author: KevinLee <br/>
 * Version: 1.0 <br/>
 * Create Date Time: 2016-08-19 0:00. <br/>
 * Update Date Time: <br/>
 */
public class ReverseStack {
    public static Stack<Integer> reverse(Stack<Integer> stack) {
        if (stack.isEmpty())
            return stack;
        else {
            int last = getLastNode(stack);
            reverse(stack);
            stack.push(last);
        }
        return stack;
    }

    private static int getLastNode(Stack<Integer> stack) {
        int value = stack.pop();
        if (stack.isEmpty())
            return value;
        else {
            int last = getLastNode(stack);
            stack.push(value);
            return last;
        }
    }

    @SuppressWarnings("unchecked")
    public static void show(Stack<Integer> stack) {
        Stack<Integer> stackt = (Stack<Integer>) stack.clone();
        StringBuffer str = new StringBuffer();
        while (!stackt.isEmpty()) {
            str.append(stackt.pop()).append("-");
        }
        str.deleteCharAt(str.length()-1);
        System.out.println(str);
    }
}
