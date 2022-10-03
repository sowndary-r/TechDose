class Solution {
    public List<Integer> findAnagrams(String s, String p) {
     int i=0,idx=0;
     int n=s.length();
     int k=p.length(); 
   char c[]=p.toCharArray(); 
     Arrays.sort(c);
    List<Integer> l=new ArrayList<>(); 
  for(i=0;i<=n-k;i++)
  { 
   String sub=s.substring(i,i+k);
   char ch[]=sub.toCharArray();
   Arrays.sort(ch);
   if(Arrays.equals(c,ch))
   l.add(i);
    }  
   return l;
   
    }
}
