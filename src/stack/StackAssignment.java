package stack;

import java.util.*;

public class StackAssignment{
	
     public static void main(String []args){
        Stack<Student> stack = new Stack();
        Student student1 = new Student("Amit",24,"KV");
        Student student2 = new Student("Praveen",25,"DPS");
        Student student3 = new Student("Rohit",26,"Bhavans");
        Student student4 = new Student("Sam",27,"DAV");
        stack.push(student1);
        stack.push(student2);
        stack.push(student3);
        stack.push(student4);        
        System.out.println(stack);
        System.out.println(stack.peek());
        if (!stack.empty())
            System.out.println(stack.pop());
        System.out.println(stack);
     }
}

class Student
{
    String name;
    int age;
    String school;
    Student(String name, int age, String school)
    {
        this.name = name;
        this.age = age;
        this.school = school;
    }
    @Override
    public String toString()
    {
    	return String.format(name+" "+age+" "+school);
    }
}