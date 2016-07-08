//Link to the problem https://www.hackerrank.com/challenges/equal-stacks
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n1 = in.nextInt();
	        int n2 = in.nextInt();
	        int n3 = in.nextInt();
	        
	        if(n1==0||n2==0||n3==0){
  	          System.out.println("0");
  	          return;
	        }
	        int sum1=0,sum2=0,sum3=0;
	        
	        //Stack1
	        int h1[] = new int[n1];
	        int h11[] = new int[n1];
	        for(int h1_i=0; h1_i < n1; h1_i++)h1[h1_i] = in.nextInt();
	        
	        //Stack2
	        int h2[] = new int[n2];
	        for(int h2_i=0; h2_i < n2; h2_i++)h2[h2_i] = in.nextInt();
	         
	        //Stack3
	        int h3[] = new int[n3];	        
	        for(int h3_i=0; h3_i < n3; h3_i++)h3[h3_i] = in.nextInt();
	            
	      
	        List<Integer> l3=new ArrayList<Integer>();
	        List<Integer> l2=new ArrayList<Integer>();
	        int k=0;
	        for(int h1_i=n1-1; h1_i >=0; h1_i--){
	            sum1+=h1[h1_i];
	            h11[k++]=sum1;
	        }
	        
	        
	        for(int h2_i=n2-1; h2_i >=0; h2_i--){
	            sum2+=h2[h2_i];
	            l2.add(sum2);
	        }
	        
	        
	        for(int h3_i=n3-1; h3_i >=0; h3_i--){
	            sum3+=h3[h3_i];
	            l3.add(sum3);
	        }
	        
	       for(int l=n1-1;l>=0;){
	    	   if(l2.contains(h11[l])&&l3.contains(h11[l])){
	    		   System.out.println(h11[l]);
	    		   return;
	    	   }
	    	   else
	    		   l--;
	       }
	     System.out.println("0");  
	  
	 }
}
