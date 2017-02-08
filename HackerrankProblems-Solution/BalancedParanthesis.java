//https://www.hackerrank.com/challenges/java-stack?h_r=next-challenge&h_v=zen


import java.util.*;
class Solution{
    
    public static boolean isBalanced(String str){
		Stack<Character> st = new Stack<Character>();
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(c=='('||c=='['||c=='{')st.push(c);
            if(c==')'||c==']'||c=='}'){
                if(st.empty())return false;
                char l=st.peek();
                if((c==')'&&l=='(')||(c=='}'&&l=='{')||(c==']'&&l=='['))st.pop();
                else return false;
            }
        }
        return st.empty();
		
	}
   
   public static void main(String []argh)
   {
      Scanner sc = new Scanner(System.in);
      
      while (sc.hasNext()) {
         String input=sc.next();
            System.out.println(isBalanced(input));
      }
      
   }
}
