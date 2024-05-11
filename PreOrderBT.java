
public class PreOrderBT 
{
		static class Node
		{
			int data;
			Node left;
			Node right;
			
			Node( int d )
			{
				this.data=d;
				this.left = null;
				this.right = null;
			}
		}
			
		static class B_Tree{
			static int idx = -1;
			public static Node buildTree( int nodes[])
			{
				idx++;
				if(nodes[idx]==-1)
					return null;
				Node newNode = new Node(nodes[idx]);
				newNode.left= buildTree(nodes);
				newNode.right= buildTree(nodes);
				return newNode;
				
			}
		}
		
	public static void main(String[] args) {
		System.out.println("Pre-Order Binary Tree");
		int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		B_Tree t = new B_Tree();
		Node result = t.buildTree(nodes);
		System.out.println(result.data);
	}

}
