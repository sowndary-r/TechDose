class Solution {
    public int calculate(String s) {
        int res=0,sign=1,curr=0;
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<s.length();i++)
        { char ch=s.charAt(i);
          if(s.charAt(i)=='+')
          {  res+=(curr*sign);
             curr=0;
             sign=1;
          }
            else if(s.charAt(i)=='-')
            {
                res+=(curr*sign);
                curr=0;
                sign=-1;
            }
            else if(s.charAt(i)=='(')
            {
               stack.push(res);
                 stack.push(sign);
                res=0;
                sign=1;
            }
            else if(s.charAt(i)==')')
            {  res+=(curr*sign);
               res*=stack.pop();
                res+=stack.pop();
             sign=1;
             curr=0;
            }
            else if(Character.isDigit(ch))
                curr=curr*10+(ch-'0');
        }
    if(curr!=0)
        res+=curr*sign;
        return res;
    }
}
