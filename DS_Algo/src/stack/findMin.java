package stack;

import java.util.*;

class StackDefine extends Stack<Integer>
{   
    Stack stack2 = new Stack();
    public void push(int element)
    {
        if (super.empty())
        {
            super.push(element);
            stack2.push(element);
        }
        else
        {
            int top = (int)stack2.peek();
            if(element < top)
            {
                super.push(element);
                stack2.push(element);
            }
            else
                super.push(element);
        }
    }
    
    public Integer pop() throws EmptyStackException
    {
            int element = super.peek();
            super.pop();
            if(!isEmpty())
            {
                if (element == (int)stack2.peek())
                    stack2.pop();
            }
        return element;
    }
    
    public int getMin()
    {
        int x = (int)stack2.peek();
        return x;
    }
    
}


public class findMin
{
    public static void main(String []args)
    {
    	StackDefine stack1 = new StackDefine();
        Scanner sc = new Scanner (System.in);
        stack1.push(sc.nextInt());
        stack1.push(sc.nextInt());
        stack1.push(sc.nextInt());
        stack1.push(sc.nextInt());
        stack1.push(sc.nextInt());
        System.out.println(stack1.getMin());
        stack1.pop();
        stack1.pop();
        System.out.println(stack1.getMin());
    }
}
