import java.util.LinkedList;

public class Graph {
	
	static class Graph1{
		
		int V;
		LinkedList<Integer> adjListArray[];
		
		Graph1(int V){
			this.V = V;
			adjListArray = new LinkedList[V];
			
			for(int i =0;i<V;i++) {
				adjListArray[i] = new LinkedList<>();
			}
		}
	}
	
	static void addEdge(Graph1 graph, int src, int desc) {
		
		graph.adjListArray[src].addFirst(desc);
		graph.adjListArray[desc].addFirst(src);
	}
	
	static void printGraph(Graph1 graph)
    {       
        for(int v = 0; v < graph.V; v++)
        {
            System.out.println("Adjacency list of vertex "+ v);
            System.out.print("head");
            for(Integer pCrawl: graph.adjListArray[v]){
                System.out.print(" -> "+pCrawl);
            }
            System.out.println("\n");
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int V = 5;
	        Graph1 graph = new Graph1(V);
	        addEdge(graph, 0, 1);
	        addEdge(graph, 0, 4);
	        addEdge(graph, 1, 2);
	        addEdge(graph, 1, 3);
	        addEdge(graph, 1, 4);
	        addEdge(graph, 2, 3);
	        addEdge(graph, 3, 4);
	      
	        // print the adjacency list representation of 
	        // the above graph
	        printGraph(graph);
	}

}
