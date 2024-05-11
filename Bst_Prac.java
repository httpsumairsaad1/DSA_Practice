public class Bst_Prac 
{
	static class Node
	{
		int data;
		Node left, right;
		public Node( int d ) {
			this.data=d;
			this.left=null;
			this.right=null;
		}
	}
	public Bst_Prac() {
		System.out.println("program started.");
	}
	public static Node insert(Node root, int d) {
		if(root==null) {
			root = new Node(d);
			return root;
		}
		if(root.data>d) {
			root.left= insert(root.left, d);
		}	else{
			root.right = insert(root.right, d);
		}
		return root;
	}
	public static void inorder(Node root) {
		if(root==null) {
			return;
		}
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
	}
	
	//find
	public static boolean search(Node root, int key) {
		if(root ==null) {
			return false;
		}
		else if(root.data>key) {
			return search(root.left, key);
		}
		else if(root.data==key) {
			return true;
		}
		else {
			return search(root.right, key);
		}
	}
	
	//height
	public static int height(Node t) {
		if(t==null)
			return 0;
		else {
			int ldepth = height(t. left);
			int rdepth = height(t.right);
			
			if(ldepth>rdepth) {
				return (ldepth+1);
			}
			else {
				return (rdepth+1);
			}
		}
	}
	public static void main(String [] args)
	{
		int values[] =  {5, 1, 3, 4, 2, 7};
        Node root = null;

        //traverse the tree
        for( int i=0; i<values.length; i++)
        {
            root = insert( root, values[i]);
        }
        System.out.print("inOrder: ");
        inorder(root);
	}
}
