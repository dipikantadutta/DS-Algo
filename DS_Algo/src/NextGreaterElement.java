import java.util.*;


public class NextGreaterElement
{

    public static void findNGE(int []arr)
    {
        Stack stack = new Stack();
        int []nge = new int[arr.length];
        for (int i = arr.length-1 ;i >= 0 ; i--)
        {
            
            while(!stack.empty() && arr[i] > (int)stack.peek())
            {
                    stack.pop();
            }
            nge[i] = stack.empty() ? -1 : (int)stack.peek();
            stack.push(arr[i]);
            
        }
        for (int i = 0 ;i <arr.length ; i++)
        {
            System.out.println(arr[i]+ " --> " +nge[i]);
        }
        
    }

    public static void main(String []args)
    {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0 ; i<n ; i++)
        {
            arr[i] = sc.nextInt();
        }
        findNGE(arr);
    }
}
