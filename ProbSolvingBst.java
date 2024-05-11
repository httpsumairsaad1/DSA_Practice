
public class ProbSolvingBst {
	static class Node
	{
		int data;
		Node left, right;
		public Node( int d) {
			this.data =d;
			this.left=null;
			this.right=null;
		}
	}
	
	//METHODS 
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
		//INORDER
		public static void inorder(Node root)
		{
			if(root==null)
				return;
			inorder(root.left);
			System.out.print(root.data+" ");
			inorder(root.right);
		}
		public static void preorder(Node root)
		{
			if(root==null)
				return;
			System.out.print(root.data+" ");
			preorder(root.left);
			preorder(root.right);
		}
		
		 //postOrder Traversal
	    public static void postOrder( Node root )
	    {
	    	if ( root == null )
	    		 return;
	    	postOrder(root.left);
	    	postOrder( root.right);
	    	System.out.print(root.data+" ");
	    }
		
		//Main
		public static void main (  String  [] args) {
			Node root = null; 
			int [] arr = {14,70,2,3,5,16,88,7};
			for( int i=0; i<arr.length; i++) {
				root = insert  ( root, arr[i]);
			}
			System.out.print("\ninorder: ");
			inorder(root);
			System.out.print("\npreorder: ");
			preorder(root);
			System.out.print("\npost: " );
		    postOrder(root);
		}
}
