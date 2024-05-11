//problems
//print the tree during the inOrder traversal.
//delete the first node from the tree.

import java.util.Scanner;
public class LabTaskOne
{
	//contractor.
	public LabTaskOne()
	{
		System.out.println(" Program started.\n ");
	}
	//node-class
	static class Node
	{
		private int data;
		private Node left, right;
		public Node( int d )
		{
			this.data=d;
			this.left=null;
			this.right=null;
		}
	}
	//insert 
	public static Node insert(Node root, int v)
	{
		if(root==null) {
			root=new Node(v);
			return root;
		}
		if(root.data>v)
			root.left= insert(root.left, v);
		else
			root.right = insert(root.right, v);
		return root;
	}
	
	//inorder- display
	public static void preorder(Node root)
	{
		if(root==null)
			return;
		System.out.print(root.data+" ");
		preorder(root.left);
		preorder(root.right);
	}
	
	//print the tree structure.
	public static void printTree( Node n, int pos)
	{
		if(n==null) {
			for(int i=0;i<pos; i++)
				System.out.print("\t");
			System.out.println("x");
			return;
		}
		printTree(n.right,pos+1);
		for(int i=0; i<pos; i++)
			System.out.print("\t");
		System.out.println(n.data);
		printTree(n.left,pos+1);
	}
	
	//delete Node in a Binary Search Tree 
		public static Node delete( Node root, int value ) {
			//check whether left or right.
			if( root.data > value)
				root.left=delete(root.left, value);
			else if ( root.data<value)
				root.right=delete(root.right, value);
			
			//root.data==value
			else
			{
				//case 1: Node left and right equal to null.
				if( root.right == null && root.left==null )
					return null;
				
				//case2: one side of Node is equal to the null.
				if(root.left==null)
					return root.right;
				else if(root.right==null)
					return root.left;
				
				//case3: left most in the right subTree.
				Node IS = inOrderSuccessor(root.right);
				root.data=IS.data;
				root.right= delete(root.right, IS.data);	//case1 or case2;
			}
			return root;
		}
		
		//calling from the delete method.
		public static Node inOrderSuccessor(Node root) {
			//finding most left in the right subTree.
			while(root.left!=null)
				root=root.left;	//update root
			return root;
		}
		
		
		//searching in Binary Search Tree.
		public static boolean search( Node root, int key) {
			if(root==null)
				return false;
			else if(root.data> key)
				return search(root.left, key);
			else if(root.data==key)
				return true;
			else
				return search(root.right, key);
		}
		
		//height of the Binary search tree.
		public static int height(Node t)
		{
			if(t==null)
				return 0;
			else
			{
				int ldepth = height(t.left);
				int rdepth = height(t.right);
				
				 if (ldepth > rdepth)
		             return (ldepth + 1);
		         else
		             return (rdepth + 1);
			}
		}
		
		//=================================================
	public static void main ( String [] ars)
	{
		Scanner sc = new Scanner( System.in);
		Node root =null;
		char ch = ' '; // ch var -> bydefault space.
		int value;
		Node deleted_Node;
		while(ch!='Q' || ch!='q') 
		{
			System.out.print("\nI. Insert D. Delete F. Find S. Show Q. Quit: ");
			ch = sc.next().charAt(0);
			
			if(ch=='Q' || ch=='q')
				break;
			
			//cases.
			switch(ch)
			{
				case 'I':
				{
					//insert
					value = sc.nextInt();
					//System.out.println(value);
					root=insert(root, value);
					break;
				}
				case 'i':
				{
					//insert
					value = sc.nextInt();
					root=insert(root, value);
					break;
				}
				case 'D':
				{
					//delete
					value = sc.nextInt();
					deleted_Node = delete(root, value);
					break;
				}
				case 'd':
				{
					//delete
					value = sc.nextInt();
					deleted_Node = delete(root, value);
					break;
				}
				case 'F':
				{
					//find or search 
					value = sc.nextInt();
					if(search(root, value))
						System.out.println("found");
					else
						System.out.println("not found");
					break;
					
				}
				case 'f':
				{
					//find or search
					value = sc.nextInt();
					if(search(root, value))
						System.out.println("found");
					else
						System.out.println("not found");
					break;
				}
				case 'S':
				{
					//Show
					printTree(root,0);
					System.out.println("=====================================");
					preorder(root);
					break;
				}
				case 's':
				{
					//show
					printTree(root,0);
					System.out.println("=====================================");
					preorder(root);
					break;
				}
			}
		}
		System.out.println("Program End, Thank you");
	}
} //umair - ucoders