package stack;

import java.util.*;

class customStack<Student>
{
        int top = -1;
        ArrayList <Student> list = new ArrayList<Student>();
        public void push(Student student)
        {
            top++;
            list.add(student);
        }
        
        public Student pop() throws EmptyStackException
        {
	           Student st = list.get(list.size()-1);
	           top--;
	           list.remove(st);
	           return st;
        }
        
        public Student peek()
        {
            if (top == -1)
                return null;
            else
            {
                Student st = list.get(list.size()-1);
                return st;
            }
        }
        
        boolean isEmpty()
        {
            return ((top==-1)?true:false);
        }
        
        @Override
        public String toString()
        {
        	return Objects.toString(list);
        }
    }

public class CustomStackAssignment
{
	
     	public static void main(String []args){
     		customStack<Student> stack = new customStack();
	        Student student1 = new Student("Amit",24,"KV");
	        Student student2 = new Student("Praveen",25,"DPS");
	        Student student3 = new Student("Rohit",26,"Bhavans");
	        Student student4 = new Student("Sam",27,"DAV");
	        stack.push(student1);
	        stack.push(student2);
	        stack.push(student3);
	        stack.push(student4);
	        System.out.println(stack);
	        if (!stack.isEmpty())
	            System.out.println(stack.peek());
	        if (!stack.isEmpty())	
	        	System.out.println(stack.pop());
	        System.out.println(stack);
	     }
}
