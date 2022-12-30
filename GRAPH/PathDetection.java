//To detect all possible path from source to destination
//Approach - DFS
import java.util.*;
public class Main
{
    static List<List<Integer>> path;
    static void dfs(List<List<Integer>> adj,List<Integer> temp,int s,int d)
    {
       if(s==d)
       {
           path.add(new ArrayList<>(temp));
           return;
       }
       for(int i:adj.get(s))
       {
           temp.add(i);
           dfs(adj,temp,i,d);
           temp.remove(temp.size()-1);
       }
    }
	public static void main(String[] args) {
	   int n=5;
	   path=new ArrayList<>();
	   List<List<Integer>> adj=new ArrayList<>();
	   for(int i=0;i<n;i++)
	   adj.add(new ArrayList<>());
	   
	   adj.get(0).add(1);
	   adj.get(1).add(2);
	   adj.get(1).add(4);
	   adj.get(2).add(3);
	   adj.get(4).add(3);
	   List<Integer> temp=new ArrayList<>();
	   int s=1,d=3;
	   temp.add(s);
	   dfs(adj,temp,s,d);
	   for(int i=0;i<path.size();i++)
	   System.out.println(path.get(i));
	}
}
