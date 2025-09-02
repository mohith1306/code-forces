import java.util.*;
public class JaggedSwaps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int size = sc.nextInt();
            int minElement = Integer.MAX_VALUE;
            int index = -1;
            boolean invalid = false;

            int[] arr = new int[size];
            for (int j = 0; j < size; j++) {
                arr[j] = sc.nextInt();
                if (arr[j] > size) {
                    invalid = true;
                }
                if (arr[j] < minElement) {
                    minElement = arr[j];
                    index = j;
                }
            }
            if (invalid) {
                System.out.println("No");
            } else if (index != 0) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }
        }
    }
}
