//java Program for insertion in AVL tree.

class Node{
	int data, height;
	Node left, right;
	Node( int d)
	{
		data=d;
		height=1;
		left=null;
		right=null;
	}
}
public class InsertionAVLTree {
	Node root;
	
	//height of the tree.
	int height(Node n) {
		if(n==null)
			return 0;
		return n.height;
	}
	
	//find max
	int max(int a, int b ){
		return (a>b)?a:b;
	}
	
	public Node rightRotate(Node y) {
		Node x = y.left;
		Node t2 = x.right;
		
		//perform rotation
		x.right = y;
		y.left = t2;
		
		//update heights
		y.height= max(height(y.left), height(y.right)) + 1;
		x.height= max(height(x.left), height(x.right)) + 1;
		
		//return new root;
		return x;
	}
	
	public Node leftRotate( Node x) {
		Node y=x.right;
		Node t2=y.left;
		
		//perform rotation
		y.left=x;
		x.right=t2;
		
		//update heights
		x.height = max(height(x.left), height(x.right))+1;
		y.height = max(height(y.left), height(y.right))+1;
		
		//return new root
		return y;
	}
	
	int getBalance(Node n) {
		if(n==null) 
			return 0;
		return height(n.left)-height(n.right);
	}
	
	Node insert( Node root, int data) 
	{
		//1. perform normal BST insertion
		if(root==null)
			return (new Node(data));
		if(data<root.data) {
			root.left = insert(root.left, data);
		}
		else if(data>root.data) {
			root.right=insert(root.right, data);
		}
		else
			return root;
		
		//2. update height of this ancestor node
		root.height = 1+ max(height(root.left), height(root.right));
		
		/*3. check balanced or unbalanced
		 * */
		int balance = getBalance(root);
		
		//four cases of rotation
		//LL case
		if( balance>1 && data<root.left.data )
			return rightRotate(root);
		//RR case
		if(balance<-1 && data>root.right.data)
			return leftRotate(root);
		
		//LR-case 
		if(balance<-1 && data< root.right.data) {
			root.left = leftRotate(root.left);
			return leftRotate(root);
		}
		
		//RL case
		if(balance<-1 && data<root.right.data) {
			root.right=rightRotate(root.right);
			return leftRotate(root);
		}
		
		//return unchanged node pointer.
		return root;
	}
	
	//traversal
	void preOrder(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }
	
	public static void main(String []args)
	{
		InsertionAVLTree tree = new InsertionAVLTree();
		tree.root = tree.insert(tree.root, 10);
		tree.root = tree.insert(tree.root, 20);
		tree.root = tree.insert(tree.root, 30);
		tree.root = tree.insert(tree.root, 40);
		tree.root = tree.insert(tree.root, 50);
		tree.root = tree.insert(tree.root, 25);
		
		/* The constructed AVL Tree would be
        30
       /  \
     20   40
    /  \     \
   10  25    50
   */
   System.out.println("Preorder traversal" +
                   " of constructed tree is : ");
   tree.preOrder(tree.root);
	}
}
//This code has been contributed by Umair Saad.