public class Graph 
{
    private int v;  // no. of vertix. 
    private int e;  //no. of edges.
    private int martix[][];
    public Graph(int nodes)
    {
    	System.out.println("start:");
        this.v= nodes;
        this.e=0;
        this.martix= new int[nodes][nodes];
    }

    //addedge
    public void addEdge( int u, int v)
    {
        // undirected graph
       martix[u][v]=1;
       martix[v][u]=1;
       e++;
    }

    //no. of edges 
    public int totalEdges()
    {
        return e;
    }

    //no. of vertix
    public int totalVertix()
    {
        return v;
    }

    //toString - display
    public void display()
    {
    	for(int i=0; i<v; i++)
    	{
    		for( int j=0; j<v; j++)
    		{
    			System.out.print(martix[i][j]+" ");
    		}
    		System.out.println();
    	}
    }
    public static void main(String []args)
    {
        Graph g = new Graph(4);
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        g.addEdge(3, 0);
        System.out.println("No. of Edges: "+g.totalEdges());
        System.out.println("No. of Vertix: "+ g.totalVertix());
        g.display();
    }
}
