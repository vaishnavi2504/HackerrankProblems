//Link to the problem  https://www.hackerrank.com/challenges/30-binary-numbers

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
 
	 public static int conseMax(int n){
	 	int count=0,max=0;
	 	while(n!=0){
	 		if(n%2!=0){
	 			count++;
	 			if(count>max)max=count;
	 		}
	 		else count=0;
	 	}
	 }
    
 
	  public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        System.out.println(conseMax(n));
	  }
}
