
public class PrintRange {
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
		
		//range
		public static void printRange( Node root, int x, int y)
		{
			if(root==null)
				return;
			if(root.data >= x && root.data <=y ) {
				printRange(root.left,x,y);
				System.out.print(root.data+" ");
				printRange(root.right,x,y);
			}
			else if( y<= root.data)
				printRange(root.left,x,y);
			else
				printRange(root.right,x,y);
		}
	public static void main (String []args )
	{
		int v[] = {1,22,55,33,11,23,8,54,234,42,3,246,90};
		Node root =null;
		
		for(int i=0; i<v.length; i++)
			root=insert(root, v[i]);
		order(root);
		System.out.print("\nRange from 5 to 95 :	");
		printRange(root, 5, 95);
	}
}
