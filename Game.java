import java.util.*;

public class Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] ali = new int[n];
            int[] bob = new int[m];
            HashSet<Integer> set = new HashSet<>();
            for (int j = 0; j < n; j++) {
                ali[j] = sc.nextInt();
                set.add(ali[j]);
            }
            int comm = 0;
            for (int j = 0; j < m; j++) {
                bob[j] = sc.nextInt();
                if (set.contains(bob[j])) {
                    comm++;
                }
            }

            int x = n - comm; 
            int y = m - comm;

            int ans;
            if (x > y) {
                ans = 2 * y + 2;
            } else {
                ans = 2 * x + 1;
            }

            System.out.println(ans);
        }
    }
}
