package tree;

public class MirrorTree {
	
	public void mirrorTree(Node node)
	{
		if (node==null)
			return;
		mirrorTree(node.left);
		mirrorTree(node.right);
		Node temp = node.left;
		node.left = node.right;
		node.right=temp;	
	}
	public void inOrder(Node node)
	{
		if (node==null)
			return;
		inOrder(node.left);
		System.out.print(node.data+" ");
		inOrder(node.right);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(1);
		root.left = new Node (2);
		root.right = new Node (3);
		root.left.left = new Node (4);
		root.left.right = new Node (5);
		root.right.left = new Node (6);
		root.right.right = new Node (7);
		MirrorTree tree = new MirrorTree();
		tree.mirrorTree(root);
		tree.inOrder(root);

	}

}
