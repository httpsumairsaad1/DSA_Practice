import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class RevLvlOrderTree {
	public RevLvlOrderTree()
	{
		System.out.println("Program Start\nReverse Level Order Tree Traversal.");
	}
	Node root;
	static class Node
	{
		int data; 
		Node left, right;
		public Node(int d ) {
			this.data=d;
			this.right=null;
			this.left=null;
		}
	}
	public void preOrder(Node root)
	{
		if(null==root)
			return;
		System.out.print(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);
	}
	public static void revLvlOrder(Node root) {
		//1
		Stack<Node> s = new Stack<Node>();
		Queue<Node> q = new LinkedList<Node>();
		
		//2- enqueue
		q.add(root);
		
		//3-while queue!=null
		while(q.isEmpty()==false) {	//false==false is true. 
			root = q.peek();
			q.remove();		//3a
			s.push(root);	//3b
			
			//3c
			if(root.right!=null)
				q.add(root.right);
			if(root.left!=null)
				q.add(root.left);
		}
		
		while(s.isEmpty()==false) {
			root=s.peek();
			
			//4
			System.out.print(root.data+" ");	
			s.pop();				
		}
		
	}
	public static void main (String [] args)
	{
		RevLvlOrderTree tree = new RevLvlOrderTree(); 
		
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(7);
		System.out.print("inOrder traversal: ");
		tree.preOrder(tree.root);
		System.out.print("\nLevel Order traversal of binary tree is :");
		revLvlOrder(tree.root);
	}
}
/*
 			  1         		  4              
            /   \	  output    /  \
          2       3    --->	  5      2 
         /  \    /  \        / \    / \
        4   5   6    7      6   7  3   1
 */
