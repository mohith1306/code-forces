import java.util.*;

public class ColourBlindness {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int cols = sc.nextInt();
            String r1 = sc.next();
            String r2 = sc.next();
            boolean same = true;
            for (int j = 0; j < cols; j++) {
                char a = r1.charAt(j);
                char b = r2.charAt(j);
                if (a == 'R' && b != 'R') {
                    same = false;
                    break;
                }
                if (b == 'R' && a != 'R') {
                    same = false;
                    break;
                }
            }

            System.out.println(same ? "Yes" : "No");
        }
    }
}
