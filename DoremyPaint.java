import java.util.*;

public class DoremyPaint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int size = sc.nextInt();
            if (size == 1) {
                sc.nextInt(); 
                System.out.println("Yes");
                continue;
            }
            if (size == 2) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println("Yes");
                continue;
            }

            int v1 = Integer.MAX_VALUE, v2 = Integer.MAX_VALUE;
            int c1 = 0, c2 = 0;
            boolean invalid = false;

            for (int j = 0; j < size; j++) {
                int val = sc.nextInt();

                if (v1 == Integer.MAX_VALUE) {     
                    v1 = val;
                    c1++;
                } 
                else if (val == v1) {            
                    c1++;
                }else if (v2 == Integer.MAX_VALUE) { 
                    v2 = val;
                    c2++;
                }
                else if (val == v2) {            
                    c2++;
                } 
                else {                         
                    invalid = true;
                }
            }

            if (invalid) {
                System.out.println("No");
                continue;
            }
            if (v2 == Integer.MAX_VALUE) {
                System.out.println("Yes");
                continue;
            }
            if (size % 2 == 0) {
                System.out.println(c1 == c2 ? "Yes" : "No");
            } else {
                System.out.println(Math.abs(c1 - c2) == 1 ? "Yes" : "No");
            }
        }
    }
}
