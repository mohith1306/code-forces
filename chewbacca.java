import java.util.Scanner;

public class chewbacca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int newNum = 0;
        int multiplier = 1;
        int leadingDigitProcessed = 0;

        while (n > 0) {
            int rem = n % 10;
            if (rem >= 5) {
                if (leadingDigitProcessed == 0 && rem == 9) {
                    rem = 9;
                } else {
                    rem = 9 - rem;
                }
            }
            newNum = rem * multiplier + newNum;
            multiplier *= 10;
            n = n / 10;
            leadingDigitProcessed = 1;
        }

        System.out.println(newNum);
    }
}
