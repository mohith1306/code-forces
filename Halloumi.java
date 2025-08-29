import java.util.*;

public class Halloumi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            if (k == 1) {
                boolean sorted = true;
                for (int j = 0; j < n - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        sorted = false;
                        break;
                    }
                }
                if (sorted) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            } else {
                System.out.println("YES");
            }
        }
    }
}