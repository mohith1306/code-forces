import java.util.*;
public class Forked {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int xK = sc.nextInt();
            int yK = sc.nextInt();
            int xQ = sc.nextInt();
            int yQ = sc.nextInt();

            int dx = xQ - xK;
            int dy = yQ - yK;

            // Build all possible knight moves (a,b) and (b,a) in 8 directions
            int[][] cand = {
                { a,  b}, { a, -b}, {-a,  b}, {-a, -b},
                { b,  a}, { b, -a}, {-b,  a}, {-b, -a}
            };

            // Use a set to avoid duplicates (when a == b)
            HashSet<String> moves = new HashSet<>();
            for (int[] m : cand) {
                moves.add(m[0] + "," + m[1]);
            }

            int count = 0;
            for (String u : moves) {
                String[] parts = u.split(",");
                int ux = Integer.parseInt(parts[0]);
                int uy = Integer.parseInt(parts[1]);
                int vx = ux + dx;
                int vy = uy + dy;
                if (moves.contains(vx + "," + vy)) {
                    count++;
                }
            }

            System.out.println(count);
        }
    }
}
