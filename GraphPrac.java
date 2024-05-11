import java.util.Scanner;
public class GraphPrac 
{
	private int V;
	private int E;
	private int adjmartix[][];
	
	public GraphPrac()
	{
		System.out.println("*** Adjacency matrix of an undirected graph implementation ***");
	}
	public GraphPrac( int size )
	{
		this.V=size; 	// no. of vertices. 
		this.E=0;		
		this.adjmartix = new int[size][size];
	}
	
	//methods
	public void martix(int u, int v) {
		adjmartix[u][v]=1;
		adjmartix[v][u]=1;
		E++;
	}
	
	//display
	public void display()
	{
		System.out.println();
		for( int i=0; i<V; ++i)
		{
			for(int j=0; j<V; j++)
			{
				System.out.print(adjmartix[i][j]+"\t");
			}
			System.out.println();
		}
	}
	public static void main(String [] args )
	{
		Scanner sc= new Scanner(System.in);
		new GraphPrac();
		System.out.print("Enter the number of the Vertices: ");
		//System.out.println(size);
		int size = sc.nextInt();
		GraphPrac g = new GraphPrac(size);
		
		int u, v;
		//martix values from the user.
		for(int i=0; i<size; i++)
		{
			System.out.println("Enter values between from 0 to "+(size-1)+":");
			u = sc.nextInt();
			v = sc.nextInt();
			g.martix(u,v);
		}
		g.display();
	}
}
