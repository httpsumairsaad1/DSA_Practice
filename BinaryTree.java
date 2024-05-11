public class BinaryTree 
{	
	public static TreeNode root;
	
	private static class TreeNode
	{
		private TreeNode left;
		private TreeNode right;
		private int data;
		
		public TreeNode( int data )
		{
			this.data=data;
			this.left = null;
			this.right=null;
		}
	}
	static public void createBinaryTree()
	{
		TreeNode first = new TreeNode(1);
		TreeNode second = new TreeNode(2);
		TreeNode third =new TreeNode(3);
		TreeNode fourth = new TreeNode(4);
		TreeNode five = new TreeNode(5);
		
		root=first;
		first.left=second;
		first.right=third;
		second.left=fourth;
		second.right=five;
		

		System.out.println("\t\t"+root.data);
		System.out.print("\t     "+first.left.data);
		System.out.println("     "+first.right.data);
		System.out.print("\t  "+second.left.data);
		System.out.println("           "+second.right.data);
		preOrder(root);
		
	}
	static void preOrder( TreeNode root)
	{
		if(root == null)
			return;
		System.out.println("PreOrder:"+root.data+" ");
		preOrder(root.left);
		preOrder(root.right);
	}
	public static void main ( String [] args)
	{
		createBinaryTree();
	}
}
