class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk=new Stack<>();
        char ch[]=s.toCharArray();
        for(char c:ch)
        {
        if(c=='(')
            stk.push(')');
        else if(c=='[')
            stk.push(']');
        else if(c=='{')
            stk.push('}');
        else if(stk.isEmpty()||stk.pop()!=c)
            return false;
        }
        return stk.isEmpty();
    }
    
}
