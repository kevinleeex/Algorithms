package No1;

import java.util.Stack;

/**
 * Description: 一个有getMin功能的栈<br/>
 * Author: KevinLee <br/>
 * Version: 1.0 <br/>
 * Create Date Time: 2016-08-15 23:35. <br/>
 * Update Date Time: <br/>
 */
public class MyStack1 {
    private Stack<Integer> stackData;//用来记录当前值
    private Stack<Integer> stackMin;//用来记录最小值，当空或当前值<=最小值时，入栈

    public MyStack1() {
        this.stackData = new Stack<>();
        this.stackMin = new Stack<>();
    }

    public void push(int number){

        if(this.stackMin.isEmpty())
            this.stackMin.push(number);

        else if(number<=this.getMin())
            this.stackMin.push(number);

        this.stackData.push(number);
    }

    public int pop(){

        if (this.stackData.isEmpty())
            throw new RuntimeException("Stack is empty!");

        int value= this.stackData.pop();

        if(value==this.getMin())
            this.stackMin.pop();
        return value;
    }

    public int getMin() {

        if(this.stackMin.isEmpty())
            throw new RuntimeException("Stack is empty!");

        return this.stackMin.peek();//Looks at the object at the top of this stack without removing it from the stack.
    }
}
