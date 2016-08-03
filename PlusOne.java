//https://leetcode.com/problems/plus-one/


public class Solution {
    public int[] plusOne(int[] a) {
        int n=a.length;
        int m=n+1;
        int i=n-1;
        int j=m-1;
        int carry=0,sum=0;
        int[] res=new int[m];
        while(i>=0){
            if(i==n-1)sum=a[i]+1;
            else sum=a[i]+carry;
            res[j]=sum%10;
            carry=sum/10;
            i--;
            j--;
        }
        if(carry!=0){
            res[0]=carry;
            return res;
        }
        else return Arrays.copyOfRange(res, 1, res.length);
    }
}
