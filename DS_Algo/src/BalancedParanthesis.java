import java.util.*;

public class BalancedParanthesis
{
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
    
    static boolean balancedParanthesis(char[] exp)
    {
        Stack<Character> stack = new Stack();
        for (int i = 0 ; i<exp.length ; i++)
        {
            if (exp[i]=='(' || exp[i]=='{' || exp[i]=='[') 
            {    
                stack.push(exp[i]);
            }
            else if (exp[i]==')' || exp[i]=='}' || exp[i]==']')
            {
                if (stack.isEmpty())
                    return false;
                else
                {
                    if (!match(stack.pop(),exp[i]))
                        return false;
                }
            }
        }
        if (stack.isEmpty())
            return true;
        else
            return false;
    }
    
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] exp = str.toCharArray();
        System.out.println(balancedParanthesis(exp));
    }
}
