import java.util.*;

public class TargetPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int k = 0; k < T; k++) {
            int sum = 0;
            for (int i = 0; i < 10; i++) {
                String row = sc.next(); // read row of 10 chars
                for (int j = 0; j < 10; j++) {
                    if (row.charAt(j) == 'X') {
                        int ring = Math.min(Math.min(i, 9 - i), Math.min(j, 9 - j));
                        sum += ring + 1;
                    }
                }
            }
            System.out.println(sum);
        }
    }
}
