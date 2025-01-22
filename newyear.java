import  java.util.*;
public class newyear {
    public static void main(String[] args) {
        int[] arr = new int[3];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<3;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int diff = arr[2] - arr[0];
        System.out.println(diff);
    }
}
