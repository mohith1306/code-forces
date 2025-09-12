import java.io.*;
import java.util.*;

public class Sofa {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(st.nextToken());
            }

            List<Integer> cannotBeOrdered = new ArrayList<>();
            int minSoFar = Integer.MAX_VALUE;

            for (int i = 0; i < n; i++) {
                if (a[i] > minSoFar) {
                    // sofa i+1 will never be chosen
                    cannotBeOrdered.add(i + 1); // +1 for 1-based index
                } else {
                    minSoFar = a[i];
                }
            }

            sb.append(cannotBeOrdered.size()).append("\n");
            if (!cannotBeOrdered.isEmpty()) {
                for (int i = 0; i < cannotBeOrdered.size(); i++) {
                    sb.append(cannotBeOrdered.get(i));
                    if (i < cannotBeOrdered.size() - 1) sb.append(" ");
                }
                sb.append("\n");
            }
        }

        System.out.print(sb.toString());
    }
}
