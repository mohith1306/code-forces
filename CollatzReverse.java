import java.util.*;

public class CollatzReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int k = sc.nextInt();
            long x = sc.nextInt();

            long ans = (long)x << k;
            System.out.println(ans);
        }
    }
}
