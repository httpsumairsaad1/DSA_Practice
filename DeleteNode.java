public class DeleteNode {
	static class Node{
		int data=0;
		Node left, right;
		public Node ( int d ) {
			this.data = d;
			this.right = null;
			this.left = null;
		}
	}
	
	//insert 
	public static Node insert ( Node root, int v )
	{
		if( null == root ) {
			root = new Node(v);
			return root;
		}
		if(root.data>v)
			root.left = insert(root.left,v);
		else
			root.right= insert(root.right,v);
		return root;
	}
	
	//inOrder
	public static void order( Node root )
	{
		if(null==root)
			return;
		order(root.left);
		System.out.print(root.data+"  ");
		order(root.right);
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
	public static Node inOrderSuccessor(Node root) {
		//finding most left in the right subTree.
		while(root.left!=null)
			root=root.left;	//update root
		return root;
	}
	
	//main method.
	public static void main (String []args )
	{
		int v[] = {1,22,55,33,11,23,8,54,234,42,3,246,90};
		Node root =null;
		
		for(int i=0; i<v.length; i++)
			root=insert(root, v[i]);
		order(root);
		System.out.println("\ndelete 23? ");
		delete(root, 1);
		order(root);
	}
}
