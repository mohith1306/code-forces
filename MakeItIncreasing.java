import java.util.*;

public class MakeItIncreasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int size = sc.nextInt();
            int[] arr = new int[size];

            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }

            int ops = 0;
            boolean possible = true;

            for (int i = size - 1; i >= 1; i--) {
                while (arr[i - 1] >= arr[i]) {
                    if (arr[i - 1] == 0) {
                        possible = false;
                        break;
                    }
                    arr[i - 1] /= 2;
                    ops++;
                }
                if (!possible) break;
            }

            System.out.println(possible ? ops : -1);
        }
        sc.close();
    }
}
