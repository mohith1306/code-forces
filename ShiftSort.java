import java.util.*;
public class ShiftSort{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=0;i<T;i++){
            int len = sc.nextInt();
            String s = sc.next();
           int zeros = 0;
            for (char c : s.toCharArray()) if (c == '0') zeros++;
            int mis = 0;
            for (int j = 0; j < zeros; j++) {
                if (s.charAt(j) == '1') mis++;
            }
            System.out.println(mis);
        }
        sc.close();
    }
}