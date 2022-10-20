class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stk=new Stack<>();
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        int[] res=new int[nums1.length];
        for(int val:nums2)
        {
          while(!stk.isEmpty()&&stk.peek()<val)
              map.put(stk.pop(),val);
         stk.push(val);
        }
        int i=0;
        for(int val:nums1)
        {
        if(map.containsKey(val))
            res[i++]=map.get(val);
        else
            res[i++]=-1;
        }
        return res;
    }
}
