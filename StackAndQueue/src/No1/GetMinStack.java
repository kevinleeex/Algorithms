package No1;

import java.util.Stack;

/**
 * Description: A stack with getMin function<br/>
 * Author: KevinLee <br/>
 * Version: 1.0 <br/>
 * Create Date Time: 2016-08-15 23:35. <br/>
 * Update Date Time: <br/>
 */
public class GetMinStack {
    private Stack<Integer> stackData;//To record the current data.
    private Stack<Integer> stackMin;//To record the minimum data.

    public GetMinStack() {
        stackData = new Stack<>();
        stackMin = new Stack<>();
    }

    public void push(int number){

        if(stackMin.isEmpty())
            stackMin.push(number);

        else if(number<=this.getMin())
            stackMin.push(number);

        stackData.push(number);
    }

    public int pop(){

        if (stackData.isEmpty())
            throw new RuntimeException("Stack is empty!");

        int value= stackData.pop();

        if(value==getMin())
            stackMin.pop();
        return value;
    }

    public int getMin() {

        if(stackMin.isEmpty())
            throw new RuntimeException("Stack is empty!");

        return stackMin.peek();//Looks at the object at the top of this stack without removing it from the stack.
    }
}
