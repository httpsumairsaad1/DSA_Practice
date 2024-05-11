public class BinaryTreeBus 
{
	static class Node
	{
		//declare
		static int data;
		Node left;
		Node right;
		
		public void displayNode() {
			System.out.println(data);
		}
	}
	static class Tree
	{
		private Node root;
		
		public Node find( int key)
		{
			//transversing 
			Node cur = root;
			while( cur.data != key)
			{
				if( key < cur.data )
				{
					System.out.println("working1");
					cur = cur.left;
				}
				
				else
				{
					System.out.println("working2");
					cur = cur.right;}
				
				if(cur==null)
					
					{
					System.out.println("working3");
					return null;}		
			}
			return cur; //found it
		}
		public void insert( int d )
		{
			Node newNode = new Node();
			newNode.data = d;
			if(root == null)
				root = newNode;
			else
			{
				Node cur = root;
				Node parent;
				while(true)
				{
					parent = cur ;
					if( d < cur.data) // go left?
					{
						cur = cur.left;
						if( cur == null )
						{
							parent.left = newNode;
							return;
						}
					}
					else	// or go right?
					{
						cur=cur.right;
						if( cur == null )
						{
							parent.right = newNode;
							return;
						}
					} 		// end else go right
				}		// end while
			} 		// end else not root
		}		// end insert method
	}
	public static void main ( String []args )
	{
		Tree t = new Tree();
		t.insert(18);
		t.insert(981);
		t.insert(57);
		t.insert(34);
		
		Node found =  t.find(34);
		if( found != null )
			System.out.println(" found ! ");
		else 
		{
			System.out.println(" not found");
		}
	}
}
