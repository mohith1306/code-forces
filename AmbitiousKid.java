import java.util.*;
public class AmbitiousKid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        int positiveElement = Integer.MAX_VALUE;
        int negativeElement = Integer.MIN_VALUE;
        int zero = 0;
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
            if(arr[i] > 0){
                positiveElement = Math.min(positiveElement, arr[i]);
            }
            else if(arr[i] < 0){
                negativeElement = Math.max(negativeElement, arr[i]);
            }
            else if(arr[i] == 0){
                zero++;
            }
        }
        if(zero > 0){
            System.out.println(0);
        }
        else if(positiveElement == Integer.MAX_VALUE){
            System.out.println(-1 * negativeElement);
        }
        else if(negativeElement == Integer.MIN_VALUE){
            System.out.println(positiveElement);
        }
        else{
            int ele = Math.min(Math.abs(negativeElement), positiveElement);
            System.out.println(ele);
        }
    }
}