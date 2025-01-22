import java.util.Scanner;

public class softdrinking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,k,l,c,d,p,nl,np;
        n = sc.nextInt();
        k = sc.nextInt();
        l = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        p = sc.nextInt();
        nl = sc.nextInt();
        np = sc.nextInt();
        int total_quant = k * l;
        int total_toast = total_quant / n;
        int total_limes = c * d;
        int salt = p / np;
        int minimum = Math.min(total_toast, Math.min(total_toast, total_limes)) / nl;
        System.out.println(minimum);
    }
}
