//https://www.hackerrank.com/challenges/designer-pdf-viewer

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 26;
        int h[] = new int[n];
        Map<Character, Integer>hm=new HashMap<>();
        char c='a';
        for(int h_i=0; h_i < n; h_i++){
            h[h_i] = in.nextInt();
            hm.put(c,h[h_i]);
            c++;
        }
        String word = in.next();
        char[] l=word.toCharArray();
        int max=0;
        
        for(int i=0;i<word.length();i++){
            if(hm.get(l[i])>max)
                max=hm.get(l[i]);                                           
        }
        
        int area=max*word.length();
         System.out.print(area);  
    }
}
