import java.util.*;

public class TrippiTroppa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < T; i++) {
            String name = sc.nextLine().trim();
            if (name.isEmpty()) {
                System.out.println(); 
                continue;
            }

            String[] arr = name.split("\\s+");
            StringBuilder sb = new StringBuilder();

            for (String word : arr) {
                sb.append(word.charAt(0)); 
            }

            System.out.println(sb.toString());
        }
    }
}
