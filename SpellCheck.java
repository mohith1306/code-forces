import java.util.*;
public class SpellCheck{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=0;i<T;i++){
            int len = sc.nextInt();
            String s = sc.next();
            String name = "Timur";
            char[] arr = name.toCharArray();
            char[] arr1 = s.toCharArray();
            Arrays.sort(arr);
            Arrays.sort(arr1);
            if(arr.length != arr1.length){
                System.out.println("No");
            }
            else{
                if(Arrays.equals(arr, arr1)){
                    System.out.println("Yes");
                }
                else{
                    System.out.println("No");
                }
            }

        }
    }
}