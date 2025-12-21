import java.util.Scanner;
import java.util.*;
public class AvtoBus{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n -- > 0){
            long m = sc.nextLong();
            if(m < 4 || (m % 2 != 0)){
                System.out.println(-1);
            }
            else{
                long min = (m+5)/6;
                long max = m/4;
                System.out.println(min+ " "+max);
            }
        }
    }
}