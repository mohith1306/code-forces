import java.util.*;
public class CompareString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            int len = sc.nextInt();
            String s = sc.next();
            int maxLen = Integer.MIN_VALUE;
            int low = 0;
            int high = 0;
            while(high < len){
                if(s.charAt(low) == s.charAt(high)){
                    high++;
                }
                else{
                    low = high;
                }
                maxLen = Math.max(high - low,maxLen);
            }
            System.out.println(maxLen+1);
        }
    }
}
