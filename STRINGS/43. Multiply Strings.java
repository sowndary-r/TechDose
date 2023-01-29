class Solution {
    public String multiply(String a, String b) {
        int pos[]=new int[a.length()+b.length()];
        for(int i=a.length()-1;i>=0;i--)
        {
            for(int j=b.length()-1;j>=0;j--)
            {
                int mul=(a.charAt(i)-'0')*(b.charAt(j)-'0');
                int p1=i+j,p2=i+j+1;
                int s=mul+pos[p2];
                pos[p1]+=s/10;
                pos[p2]=s%10;
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int p:pos){
            if(!(p==0 && sb.length()==0))sb.append(p);
        }
        return sb.length()==0?"0":sb.toString();
    }
}
