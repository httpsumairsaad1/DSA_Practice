public class BinaryTreeTwo 
{
	static class NodeTree{
		static int data;
		static int size=0;
		static NodeTree left, right;
		public NodeTree( int d )
		{
			this.data=d;
			this.left=null;
			this.right=null;
			size++;
		}
	}
	public static void buildBinaryTree()
	{
		NodeTree first = new NodeTree(1);
		NodeTree second = new NodeTree(2);
		NodeTree third = new NodeTree(3);
		NodeTree fourth = new NodeTree(4);
		NodeTree five = new NodeTree(5);
		NodeTree six = new NodeTree(6);
		
		first.left = second;
		first.right= third;
		second.left= fourth;
		second.right=five;
		third.right=six;
		System.out.println("Done!");
		
	}
	public static void main ( String [] args )
	{
		buildBinaryTree();
	}
}
