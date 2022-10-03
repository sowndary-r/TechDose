class Solution {
    public int lengthOfLongestSubstring(String s) { 
  Set<Character> set=new HashSet<>();
   int l=0,r=0;
   int len=0;
 while(r<s.length())
 { 
   if(!(set.contains(s.charAt(r))))
  { 
       set.add(s.charAt(r)); 
       r++;
     len=Integer.max(len,set.size());
     //set.add(s.charAt(r));
  }
  else 
  { 
     
    set.remove(s.charAt(l));  
    l++;
  
  }
     
 } 
        return len;
    }
}
