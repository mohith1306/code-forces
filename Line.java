import java.util.*;
public class Line {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int len = sc.nextInt();
            String dir = sc.next();
            long baseScore = 0;
            List<Long> gains = new ArrayList<>();
            for (int i = 0; i < len; i++) {
                if (dir.charAt(i) == 'L') {
                    baseScore += i;
                    gains.add((long)(len - i - 1) - i);
                } else {
                    baseScore += (len - i - 1);
                    gains.add((long)i - (len - i - 1));
                }
            }
            Collections.sort(gains, Collections.reverseOrder());
            long currScore = baseScore;
            for (int k = 0; k < len; k++) {
                if (gains.get(k) > 0) {
                    currScore += gains.get(k);
                }
                System.out.print(currScore + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
