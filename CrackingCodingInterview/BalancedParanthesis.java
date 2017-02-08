//https://www.hackerrank.com/challenges/ctci-balanced-brackets

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static boolean isBalanced(String expression) {
        char[] c=expression.toCharArray();
        Stack<Character> st=new Stack<>();
        for(char x:c){
            if(x=='('||x=='{'||x=='[')st.push(x);
            else if(x==')'||x=='}'||x==']'){
                if(st.isEmpty())return false;
                char t=st.peek();                
                if(x==')'&&t=='(')st.pop();
                else if(x=='}'&&t=='{')st.pop();
                else if(x==']'&&t=='[')st.pop();
                else return false;
            }
            
        }
        return st.isEmpty();
      
     }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            boolean answer = isBalanced(expression);
            if(answer)
                System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
