import java.util.*;
public class arrivalofgeneral {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        for(int i = 0;i<n;i++){
            if(arr[i] > max){
                max = arr[i];
            }
            else if(arr[i] <= min){
                min = arr[i];
            }
        }
        int maxIndex = 0;
        int minIndex = 0;
        for(int i = 0;i<n;i++){
            if(arr[i] == max){
                maxIndex = i;
            }
            else if(arr[i] == min){
                minIndex = i;
            }
        }
        System.out.println(maxIndex + (n-1-minIndex) - (maxIndex>minIndex?1:0));
    }
    
}
