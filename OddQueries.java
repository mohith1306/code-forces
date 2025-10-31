import java.util.*;

public class OddQueries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int q = sc.nextInt();
            int[] arr = new int[n];
            long[] prefix = new long[n + 1];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                prefix[i + 1] = prefix[i] + arr[i];
            }

            while (q-- > 0) {
                int l = sc.nextInt();
                int r = sc.nextInt();
                int k = sc.nextInt();

                long totalSum = prefix[n];
                long rangeSum = prefix[r] - prefix[l - 1];
                long newSum = totalSum - rangeSum + (long) (r - l + 1) * k;

                if (newSum % 2 != 0)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
        }
        sc.close();
    }
}
