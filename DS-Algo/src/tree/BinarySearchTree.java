package tree;

import java.util.Stack;

class Node
{
	int data;
	Node left = null, right  = null;
	Node(int data)
	{
		this.data = data;
	}
}
public class BinarySearchTree {
	public static void main (String []args)
	{
		Node root = new Node(10);
		root.left = new Node (5);
		root.right = new Node (19);
		root.left.left = new Node (1);
		root.left.right = new Node (6);
		root.right.left = new Node (17);
		BinarySearchTree tree = new BinarySearchTree();
		boolean res = tree.isBST(root);
		if (res)
			System.out.println("Is a Binary Search Tree");
		else
			System.out.println("Not a Binary Search Tree");
	}
	    boolean isBST(Node node) 
	    { 
	    	Node prev = null; 
	        if (node != null) 
	        { 
	        	System.out.println("node "+node.data);
	            if (!isBST(node.left)) 
	                return false; 
	            if (prev != null && node.data <= prev.data ) 
	                return false; 
	            prev = node; 
	            return isBST(node.right); 
	        } 
	        return true; 
	    }

}
