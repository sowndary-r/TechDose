class Solution {
    static List<List<Integer>> res;
    static void sub(int[] n,int pos,List<Integer> l)
    {
      //base case
       if(pos==n.length)
       {
          res.add(new ArrayList<>(l));
           return;
       }
        //excluing the element
        sub(n,pos+1,l);
        //including the element
        l.add(n[pos]);
         sub(n,pos+1,l);
        l.remove(l.size()-1);
    }
    public List<List<Integer>> subsets(int[] nums) {
        res=new ArrayList<>();
    sub(nums,0,new ArrayList<Integer>());
        
        return res;
    }
}
