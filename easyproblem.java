import java.util.*;
public class easyproblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i<n;i++){
            if(sc.nextInt() == 1){
                System.out.println("Hard");
                return;
            }
        }   
        System.out.println("Easy");
    }
    
}
