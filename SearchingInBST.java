public class SearchingInBST {
	
	//contractor
	static class Node
	{
		int data;
		Node left, right;
		public Node( int d) {
			this.data=d;
			this.left=null;
			this.right=null;
		}
	}
	
	//insert a Node in Binary Search tree
	public static Node insert( Node root, int v ) {
		if( root == null ) {
			root=new Node(v);
			return root;
		}
		if(root.data>v)
			root.left=insert(root.left, v);
		else
			root.right=insert(root.right,v);
		return root;
	}
	
	//sequence order
	public static void inOrder( Node root)
	{
		if(root==null)
			return;
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
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
	public static void main ( String [] args ) {
		Node root=null;
		int []v= {2,5,3,5,71,4,13,7,36,66};
		
		for(int i=0; i<v.length; i++)
			root=insert(root, v[i]);
		inOrder(root);
		
		System.out.print("\nfind 71: ");
		if(search(root, 71))
			System.out.println("found");
		else
			System.out.println("not found");
	}
}
