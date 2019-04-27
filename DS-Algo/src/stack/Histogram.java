package stack;

import java.util.*;

public class Histogram {
	public static void main(String []args)
    {
		int arr[] = {6,2,5,4,5,1,6};
		Histogram hist = new Histogram();
		System.out.println(hist.maxHistogram(arr));
    }

	public int maxHistogram(int[] arr) {
		int area=0;
		int maxArea = 0;
		int i ;
		Stack<Integer> stack = new Stack<>();
		for (i=0;i<arr.length;)
		{
			if (stack.isEmpty() || arr[i]>=arr[stack.peek()] )
			{
				stack.push(i);
				i++;
			}
			else
			{
				int top = stack.pop();
				if (stack.isEmpty())
					area = arr[top] * i;
				else
					area = arr[top] * (i-stack.peek()-1);
			}
			if (area>maxArea)
				maxArea = area;
		}
		if (!stack.isEmpty())
		{
			int top = stack.pop();
			if (stack.isEmpty())
				area = arr[top]*i;
			else
				area = arr[top]*(i-stack.peek()-1);
			if (area>maxArea)
					maxArea = area;
		}
			
		return maxArea;
	}
}
