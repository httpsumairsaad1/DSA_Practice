public class InsertBinaryTree {
	private Node root ;
	static class Node
	{
		private static int data;
		private static Node left, right;
		public Node ( int d )
		{
			this.data=d;
			this.left=null;
			this.right=null;
		}
	}
	
	public void insert( int v )
	{
		System.out.println(root.data +" " +v);
		root = insert(root, v);
		System.out.println(root.data +" " +v);
		System.out.println();
	}
	
	public Node insert( Node r, int v)
	{
		if(null==r) {
			r = new Node(v);
			System.out.println("if-null" );
			return r;
		}
		if(v<r.data)
			{
			System.out.println("if" +r.left.data);
			r.left=insert(r.left, v);
			
			}
		else
			{
			System.out.println("else" );
			r.right=insert(r.right, v);
			}
		return r;
	}
	public static void main ( String [] args )
	{
		InsertBinaryTree obj = new InsertBinaryTree();
		obj.insert(4);
		obj.insert(2);
	}
}
