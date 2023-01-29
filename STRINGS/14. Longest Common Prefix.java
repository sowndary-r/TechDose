class Solution {
    public String longestCommonPrefix(String[] str) {
        String res=str[0];
        for(int i=1;i<str.length;i++)
        {
            while(str[i].indexOf(res)!=0)
            {
                res=res.substring(0,res.length()-1);
            }
        }
        return res;
    }
}
