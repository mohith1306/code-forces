import java.util.*;
public class sumofround {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0;i<n;i++){
            int num = arr[i];
            if(num > 0 && num <= 10){
                System.out.println(1);
                System.out.println(num);
            }
            else{
                int count = 0;
                int j = 0;
                while(num > 0){
                    if(num % 10 != 0){
                        System.out.print((num%10) * Math.pow(10,count));
                    }
                    count++;
                    j++;
                    num = num / 10;
                }
            }
        }
    }
}
