class Solution {
    public int longestSubstring(String s, int k) {
     return func(s.toCharArray(),0,s.length(),k);
    }
   static int func(char[] a,int st,int en,int k)
  {  
    if(en-st<k)
     return 0;
     int freq[]= new int[26];
   for(int i=st;i<en;i++)
   freq[a[i]-'a']++;
 
 for(int i=st;i<en;i++)
 { 
   if(freq[a[i]-'a']<k)
  {  int j=i+1;
   while(j<en && freq[a[j]-'a']<k)
    j++; 
 return Math.max(func(a,st,i,k),func(a,j,en,k));
  }
 }  
  return en-st; 
       }
}
