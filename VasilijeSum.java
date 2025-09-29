import java.util.*;
public class VasilijeSum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            long n = sc.nextLong();
            long k = sc.nextLong();
            long x = sc.nextLong();
            long minSum = (k*(k+1)) / 2;
            long maxSum = (n*(n+1))/ 2 - ((n-k)*(n-k+1))/2;
            if(x >= minSum && x<= maxSum){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
}