import java.util.*;

public class Lever {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        for (int i = 0; i < testCases; i++) {
            int len = sc.nextInt();
            int[] a = new int[len];
            int[] b = new int[len];
            for (int j = 0; j < len; j++) {
                a[j] = sc.nextInt();
            }
            for (int j = 0; j < len; j++) {
                b[j] = sc.nextInt();
            }
            int count = 1;
            for (int j = 0; j < len; j++) {
                if (a[j] > b[j]) {
                    count += a[j] - b[j];
                }
            }
            System.out.println(count);
        }
    }
}