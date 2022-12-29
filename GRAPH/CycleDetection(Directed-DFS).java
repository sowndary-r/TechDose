import java.util.*;
public class Main
{
    //cycle detection method
    static boolean iscyclic(List<List<Integer>> adj,boolean vis[],int curr)
    {
        if(vis[curr]==true)
        return true;
        vis[curr]=true;
        for(int i=0;i<adj.get(curr).size();i++)
        {
             if(iscyclic(adj,vis,adj.get(curr).get(i)))
                return true;
        }
        vis[curr]=false;
        return false;
    }
     public static void iscycle(int n,List<List<Integer>> adj){
        boolean vis[]=new boolean[n+1]; 
        for(int i=0;i<=n;i++) 
        {
            if(iscyclic(adj,vis,i))
            {
                System.out.print("Cycle Found"); 
                return;
            }
        }
        System.out.print("Cycle not Found"); 
    }  
    
	public static void main(String[] args) {
	    List<List<Integer>> adj=new ArrayList<>();
	    int v=6;
	    for(int i=0;i<=v;i++)
	    adj.add(new ArrayList<>());
	    
	    //adjacency List
	   adj.get(0).add(1);
        adj.get(1).add(2);
        adj.get(1).add(3);
       adj.get(2).add(4);
        adj.get(2).add(3);
       adj.get(4).add(5);
        adj.get(5).add(2);
	    
	    //calling cycle detection method
	   iscycle(v,adj);
	}
}
