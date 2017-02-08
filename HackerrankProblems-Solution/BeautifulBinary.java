//Link https://www.hackerrank.com/challenges/beautiful-binary-string


public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String B = in.next();
        int count=0;
        char[] ch=B.toCharArray();
        for(int i=0;i+2<n;i=i+1){
            if(ch[i]=='0'&&ch[i+1]=='1'&&ch[i+2]=='0'){
                count++;
                ch[i+2]='1';
            } 
        }
        System.out.println(count);
    }
}
