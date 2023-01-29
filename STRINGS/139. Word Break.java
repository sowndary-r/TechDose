class Solution {
    public boolean wordBreak(String s, List<String> word) {
        boolean res[]=new boolean[s.length()+1];
        res[0]=true;
        for(int i=1;i<s.length()+1;i++)
        {
            for(int j=0;j<i;j++)
            {
                if( res[j] && word.contains(s.substring(j,i)))
                {
                    res[i]=true;break;
                }
            }
        }
        return res[s.length()];
    }
}
