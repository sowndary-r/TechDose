class Solution {
    public String addStrings(String a, String b) {
        String res="";
       int i=a.length()-1;
        int j=b.length()-1;
        int carry=0;
        while(i>=0||j>=0)
        {
          int sum=carry;
          if(i>=0)sum+=a.charAt(i--)-'0';
          if(j>=0)sum+=b.charAt(j--)-'0';
            res=sum%10+res;
            carry=sum/10;
        }
        if(carry!=0)
            res=carry+res;
        return res;
    }
}
