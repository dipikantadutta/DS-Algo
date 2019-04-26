package linkedlist;

class Node
{
	int data;
	Node next;
	
}
public class ReverseLinkedList {
	static Node head;
	static Node reverseLinkedList(Node head)
	{
		Node prev = null;
		Node curr = head;
		Node next = null;
		if (head==null || head.next==null)
			return head;
		while(curr!=null)
		{
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		
		return prev;
	}
	
	static Node insert(int data)
	{
		Node node = new Node();
		node.data = data;
		node.next = null;
		if (head == null)
			head = node;
		else
		{
			Node n = head;
			while(n.next!=null)
			{
				n = n.next;	
			}
			n.next = node;
		}
		
		
		return head;
	}
	
	public void printList(Node head) {
		Node node = head;
		while(node.next!=null)
		{
			System.out.print(node.data+" ");
			node = node.next;
		}
		System.out.println(node.data);
	}
	
	public static void main (String []args)
	{
		ReverseLinkedList revlist = new ReverseLinkedList();
		head = revlist.insert(3);
		revlist.insert(15);
		revlist.insert(9);
		revlist.insert(11);
		revlist.printList(head);
		head = reverseLinkedList(head);
		revlist.printList(head);
	}
	
}
