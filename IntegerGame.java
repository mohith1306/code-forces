import java.util.*;
public class IntegerGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=0;i<T;i++){
            int num = sc.nextInt();
            if(num % 3 == 0){
                System.out.println("Second");
            }
            else{
                System.out.println("First");
            }
        }
    }
}
