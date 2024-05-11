class Nde
{
	int data;
	Nde left, right;
	public Nde( int d ) 
	{
		data=d;
		left=null;
		right=null;
	}
}
public class TestPrep {
	public TestPrep()
	{
		System.out.println("DSA Test prep");
	}
	//insert
	public static Nde insert( Nde root , int v)
	{
		if(v==-1)
			return root;
		if( root == null )
		{
			root=new Nde(v);
			return root;
		}
		if( root.data>v)
			root.left = insert(root.left, v);
		else
			root.right = insert (root.right, v);
		return root;
	}
	
	//inorder
	public static void inorder( Nde root )
	{
		if( root == null )
			return;
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
	}
	
	//preorder
	public static void preorder(Nde root )
	{
		if(null==root)
			return;
		System.out.print(root.data+" ");
		preorder(root.left);
		preorder(root.right);
	}
	
	//postOrder
	public static void postorder(Nde root)
	{
		if( null==root)
		{
			return;
		}
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.data+" ");
	}
	
	//Searching in Bst
	public static boolean search(Nde root, int key) {
		if(root==null)
			return false;
		else if(root.data> key)
			return search(root.left, key);
		else if( root.data==key)
			return true;
		else
			return search(root.right, key);
	}
	public static void main (  String []args )
	{
		new TestPrep();
		Nde root=null;
		int arr[] = {1,2,4,30,-1,-1,60,-1,-1,5,-1,70,-1,-1,3,10,-1,80,-1,-1,20,-1,81,-1,-1};
		for( int i = 0 ; i<arr.length; i++) {
			root= insert(root,arr[i]);
		}
		System.out.print("PreOrder: ");
		preorder(root);
		System.out.print("\nInOrder: ");
		inorder(root);
		System.out.print("\nPostOrder: ");
		postorder(root);
		
		if(search(root, 423)) {
			System.out.println("\nfound !");
		}
		else
			System.out.println("\nnot found !");
			
	}
}
