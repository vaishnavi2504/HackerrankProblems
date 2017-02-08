//https://www.hackerrank.com/challenges/beautiful-days-at-the-movies

import java.io.*;
import java.util.*;

public class Solution {
    
    public static int count(int n){
		int ans=0;
		while(n>0){
			n=n/10;
			ans++;
		}
		return ans;
	}
	
	public static int revDigits(int n){
        int rev=0;
        int i=count(n)-1;
        int temp=0;
        while(n>0){
            temp=n%10;
            rev+=temp*Math.pow(10,i);
            i--;
            n=n/10;
        }
        return rev;
    }


    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int countBeautiful=0;
        int s=in.nextInt();
        int e=in.nextInt();
        int k=in.nextInt();   
        for(int i=s;i<=e;i++){            
            if(Math.abs(i-revDigits(i))%k==0)countBeautiful++;            
        }
       System.out.println(countBeautiful);        
       
    }
}
