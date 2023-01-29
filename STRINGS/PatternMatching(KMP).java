import java.util.*;
public class Main
{
static ArrayList<Integer> search(String pat, String txt)
    {
        ArrayList<Integer> ans=new ArrayList<>();
        int n=txt.length();
        int m=pat.length();
        int lps[]=new int[m];
        lps=filllps(pat,lps);
        int i=0,j=0;
        while(i<n)
        {
            if(pat.charAt(j)==txt.charAt(i))
            {
                i++;
                j++;
            }
            if(j==m){
                ans.add(i-j+1);
                j=lps[j-1];
            }
            else if(i<n&&pat.charAt(j)!=txt.charAt(i)){
                if(j==0)i++;
                else j=lps[j-1];
            }
        }
        return ans;
    }
    static int[] filllps(String pat,int []lps)
    {
        int m=pat.length();
        int len=0;
        lps[0]=0;
        int i=1;
        while(i<m)
        {
            if(pat.charAt(i)==pat.charAt(len))
            {
                len++;
                lps[i]=len;//add count
                i++;
            }
            else//if not
            {
                if(len==0)//len is 0 
                {
                    lps[i]=0;
                    i++;
                }
                else
                {
                    len=lps[len-1];
                }
            }
        }
        return lps;
    
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String txt=sc.next();
        String pat=sc.next();
        System.out.print(search(pat,txt));
    }
}
