//Link  https://www.hackerrank.com/challenges/reduced-string

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    	public static boolean areTwins(String str){
		if(str.equals(null))return false;
		char[] ch=str.toCharArray();
		int n=str.length();
		
		for(int i=0;i+1<n;i=i+1){
			if(ch[i]==ch[i+1])return true;
		}
		return false;
	}
	
	
	public static String destroyTwins(String s){
		char[] ch=s.toCharArray();
		if(ch.length==0)return null;
    	List<Character>al=new ArrayList<Character>();
    	
    	int count=0;
    	int i;
    	char v=' ';
    	int n=ch.length;
	        for(i=0;i+1<ch.length;){
	        	
	            if(ch[i]==ch[i+1])i=i+2;        	
	            else{
	            	v=ch[i];
			         al.add(v);
			         i++;
	            }
	        }
	        if(i==n-1){
	        	v=ch[n-1];
	        	al.add(v);
	        }
	        
	       if(al.size()==0)return null;
	       String res="";
	        
		   for(char t:al){
		        	res+=t;
		    }
	      
        //Recursively invoke destroytwins() until there are no more twin pairs in the string
	     if(!areTwins(res))return res;
	     else return destroyTwins(res);
	    
	}


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        if(destroyTwins(str)==(null))
         System.out.println("Empty String");
		    else
	       System.out.println(destroyTwins(str));
        
    }
}
