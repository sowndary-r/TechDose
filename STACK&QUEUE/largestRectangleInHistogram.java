class Solution {
    public int largestRectangleArea(int[] h) {
        int max=0;
        Stack<Integer> st=new Stack<Integer>();
        int n=h.length;
        for(int i=0;i<=n;i++)
        {
            int curr=(i==n)?0:h[i];
            while(!st.isEmpty()&&curr<h[st.peek()])
            {
                int top=st.pop();
                int width=(st.isEmpty())?i:i-st.peek()-1;
                int area=width*h[top];
                max=Math.max(max,area);
            }
            st.push(i);
        }
        return max;
    }
}
