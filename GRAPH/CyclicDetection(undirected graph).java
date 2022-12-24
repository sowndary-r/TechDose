//Approach: Disjoint set union find(DSUF)
//TC : 0(E*V);

import java.util.*;
public class Main
{
    static int parent[];
    static int find(int v)
    {
        if(parent[v]==-1)  //if -1,then it is the absolute parent
        return v;
        return find(parent[v]);
    }
    static void union(int from,int to)
    {
        from=find(from); 
        to=find(to);
        parent[from]=to; //connecting both absolute parents
    }
    static boolean iscyclic(List<List<Integer>> l)
    {
        for(int i=0;i<l.size();i++)
        {
          List<Integer> list=new ArrayList<>(l.get(i));
          int from=list.get(0);
          int to=list.get(1);
          int fp=find(from); //finding the absolute parent of from node
          int tp=find(to);  //finding the absolute parent of to node
          if(fp==tp) //if the abs parents are same return true
          return true;
          union(fp,tp); //if not same, union both the sets
        }
        return false;
    }
	public static void main(String[] args) {
	    int vertices=4;
	    parent=new int[vertices];
	    List<List<Integer>> adj=new ArrayList<>();
	    for(int i=0;i<vertices;i++)
	    parent[i]=-1;
    //Edge List:
	    adj.add(Arrays.asList(0,1));
	    adj.add(Arrays.asList(1,2));
	    adj.add(Arrays.asList(2,3));
	    adj.add(Arrays.asList(1,2));
	    if(iscyclic(adj))
		System.out.println("cyclic");
		else
		System.out.println("non cyclic");
	}
}
