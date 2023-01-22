class Solution {
    boolean res;
    public boolean canPartition(int[] nums) {
        int tot=0;
        for(int i:nums)tot+=i;
        if(tot%2!=0)return false;
        comb(0,nums,tot/2,new ArrayList<>());
        return res;
    }
    void comb(int curr,int []a,int tar,List<Integer> l)
    {
        if(curr==a.length)
        {
            if(tar==0)res=true;
            return;
        }
        if(tar>a[curr])
        {
            l.add(a[curr]);
            comb(curr+1,a,tar-a[i],l);
            l.remove(l.size()-1);
        }
        comb(curr+1,a,tar,l);
        
    }
}
