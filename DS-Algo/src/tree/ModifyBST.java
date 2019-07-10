package tree;

public class ModifyBST {
	Node prev = null;
	void printInorder(Node node) 
    { 
		
        if (node == null) 
            return; 
        printInorder(node.left); 
        
        if (prev!=null)
        {
        	node.data = prev.data+node.data;
        }
        System.out.print(node.data+" ");
        prev=node;
        printInorder(node.right); 
    } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(10);
		root.left = new Node (5);
		root.right = new Node (20);
		root.left.left = new Node (2);
		root.left.right = new Node (6);
		root.right.left = new Node (15);
		ModifyBST tree = new ModifyBST();
		tree.printInorder(root);
	}

}
