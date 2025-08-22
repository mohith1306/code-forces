import java.util.*;

public class SecretNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            long num = sc.nextLong(); 
            boolean found = false;
            long power = 10;
            ArrayList<Long> divisors = new ArrayList<>();
            while(power +1 <= num){
                if(num % (power + 1) == 0){
                    divisors.add(num / (power + 1));
                }
                power *= 10;
            }

            if (divisors.isEmpty()) System.out.println(0);
            else{
                System.out.println(divisors.size());
                Collections.sort(divisors);
                for (int i = 0; i < divisors.size(); i++) {
                    System.out.println(divisors.get(i));
                }
            }
        }
    }
}
