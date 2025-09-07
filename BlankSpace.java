import java.util.*;
public class BlankSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=0;i<T;i++){
            int size = sc.nextInt();
            int[] arr = new int[size];
            for(int j=0;j<size;j++){
                arr[j] = sc.nextInt();
            }       
            int left = 0;
            int right = 0;
            int maxLength = -1;
            while(right < size){
                if(arr[right] == 0){
                    maxLength = Math.max(maxLength, right - left+1);
                    right++;
                }
                else{
                    right++;
                    left = right;
                }
            }
            if(maxLength == -1) System.out.println(0);
            else System.out.println(maxLength);
        }
    }
}
