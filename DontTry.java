import java.util.*;
public class DontTry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int size1 = sc.nextInt(); 
            int size2 = sc.nextInt(); 
            String str1 = sc.next();
            String str2 = sc.next();

            StringBuilder sb = new StringBuilder(str1);
            int count = 1; 
            while (sb.length() < str2.length()) {
                sb.append(str1);
                count++;
            }
            if (sb.indexOf(str2) != -1) {
                System.out.println(count);
            } else {
                sb.append(str1);
                count++;
                if (sb.indexOf(str2) != -1) {
                    System.out.println(count);
                } else {
                    System.out.println(-1);
                }
            }
        }
    }
}
