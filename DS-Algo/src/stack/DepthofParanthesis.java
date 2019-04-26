package stack;

import java.util.*;

public class DepthofParanthesis {
	    static boolean match(char ch1, char ch2)
	    {
	        if (ch1 =='(' && ch2 == ')')
	            return true;
	        else if (ch1 == '{' && ch2 == '}') 
	            return true;
	        else if (ch1 == '[' && ch2 == ']')
	            return true;
	        else
	            return false;
	    }
	    
	    static int balancedParanthesis(char[] exp)
	    {
	        int depth = 0;
	        Stack<Character> stack = new Stack();
	        for (int i = 0 ; i<exp.length ; i++)
	        {
	            if (exp[i]=='(' || exp[i]=='{' || exp[i]=='[') 
	            {    
	                stack.push(exp[i]);
	                if (stack.size()>depth)
	                    depth = stack.size();
	            }
	            else if (exp[i]==')' || exp[i]=='}' || exp[i]==']')
	            {
	                if (stack.isEmpty())
	                    return -1;
	                else
	                {
	                    if (!match(stack.pop(),exp[i]))
	                        return -1;
	                }
	            }
	        }
	        
	        if (stack.isEmpty())
	            return depth;
	        else
	            return -1;
	        
	    }
	    
	    public static void main (String[] args)
	    {
	        //Scanner sc = new Scanner(System.in);
	        String str = "(((X))(((Y))))";
	        char[] exp = str.toCharArray();
	        System.out.println(balancedParanthesis(exp));
	    }
}

