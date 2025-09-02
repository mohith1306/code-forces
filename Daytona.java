import java.util.*;
public class Daytona{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=0;i<T;i++){
            int size = sc.nextInt();
            int digit = sc.nextInt();
            int[] num = new int[size];
            HashMap<Integer,Integer> map = new HashMap<>();
            for(int j=0;j<size;j++){
                num[j] = sc.nextInt();
                map.put(num[j],map.getOrDefault(num[j], 0)+1);
            }
            if(!map.containsKey(digit)){
                System.out.println("No");
            }
            else{
                System.out.println("Yes");
            }
        }
    }
}