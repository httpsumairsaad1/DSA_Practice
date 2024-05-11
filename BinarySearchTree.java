class BinarySearchTree
{
    static class Node
    {
         int data ;
         Node left; 
         Node right;

         public Node(int d)
         {
            this.data= d; 
            this.left= null;
            this.right=null;
         }
    }

    public static Node insert( Node root, int val){
        if( root == null ){
            root = new Node(val);
            return root;
        }
        // checking  left or right;
        if( root.data> val)
        {
            root.left = insert(root.left, val);
            
        }
        else{
            root.right = insert ( root.right, val );
            
        }
        return root;
    }
    
    //inOrder Traversal
    public static void inorder(Node root )
    {
    	if(root==null)
    		return;
    	inorder(root.left);
    	System.out.print(root.data+" ");
    	inorder(root.right);
    	
    }
    
    //preOrder Traversal
    public static void preOrder( Node root )
    {
    	if(root==null)
    		return;
    	System.out.print(root.data+" ");
    	preOrder(root.left);
    	preOrder( root.right);
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
    public static void main ( String [] args )
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
        System.out.print("\npre: ");
        preOrder(root);
        System.out.print("\npost: " );
        postOrder(root);
    }
} 