class Solution {
    static List<String> res;
    public List<String> generateParenthesis(int n) {
        res=new ArrayList<>();
        par(n,n,"",res);
        return res;
    }
    static void par(int l,int r,String str,List<String> res) // l and r to check the count of ( and ) respectively
    {
      if(l<=r)
      {
          if(l==0&&r==0)     //base condition
          {
              res.add(str);
              return;
          }
      
          if(l<0||r<0)      
          return;
      
          par(l-1,r,str+"(",res);  //left recursion
          par(l,r-1,str+")",res);  //right recursion
      }
    }
}
