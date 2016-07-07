//Link to the problem  https://www.hackerrank.com/challenges/30-binary-numbers

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
  public static int conseMax(int n){
		String str=Integer.toBinaryString(n);
		int count=0,max=0;
		for(int i=1;i<str.length();i++){
			char c=str.charAt(i);
			char d=str.charAt(i-1);
			if(c=='1'&&d=='1')count++;
			else{
				if(count>max)max=count;
				count=0;
			}
		}
		if(count>max)max=count;
		return max+1;
	}

  public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(conseMax(n));
  }
}
