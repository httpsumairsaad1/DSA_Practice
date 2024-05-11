class BstLibrary {
	//NODE_CLASS
	static class Node
	{
		int data; 
		Node left, right;
		
		//CONTRACTOR
		Node( int d ){
			this.left = null;
			this.right= null;
			this.data=d;
		}
	}
	//INSERT THE NODE.
	public static Node insert( Node root, int d ) {
		if( root == null) {
			root = new Node(d);
			return root ;
		}
		if( root.data> d) {
			root.left = insert( root.left, d);
		}
		else {
			root.right = insert( root.right, d);
		}
		return root;
	}
	
	//PREORDER
	public static void preorder( Node root ) {
		if (  root == null)
			return ; 
		preorder(root.left);
		System.out.print(root.data+" ");
		preorder(root.right);
	}
	
	//POSTORDER
	public static void postorder( Node root ) {
		if (  root == null)
			return ; 
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.data+"  ");
	}
	
	//INORDER
	public static void inorder( Node root ) {
		if (  root == null)
			return ;
		inorder(root.left);
		System.out.print(root.data+"  ");
		inorder(root.right);
	}
	public static void  main ( String [] args)
	{
			Node root = null;
			
			insert(root, 20);
			insert(root, 30);
			System.out.print("inOrder: ");
	        preorder(root);
//	        System.out.print("\npre: ");
//	        preorder(root);
//	        System.out.print("\npost: " );
//	        postorder(root);
	}
}
