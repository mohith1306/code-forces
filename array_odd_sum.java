import java.util.*;
public class array_odd_sum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        for(int i=0;i<n;i++){
            int size = sc.nextInt();
            int[] array = new int[size];
            int sum = 0;
            int even = 0;
            int odd = 0;
            for(int j=0;j<size;j++){
                array[j] = sc.nextInt();
                if(array[j] % 2 == 0) even++;
                else{
                    odd++;
                }
                sum+=array[j];
            }
            if(sum % 2 != 0) System.out.println("YES");
            else{
                if(odd > 0 && even > 0) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}