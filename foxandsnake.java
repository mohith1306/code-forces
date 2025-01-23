import java.util.*;
public class foxandsnake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        for(int i=1;i<=m;i++){
            if(i % 2 == 0 && i % 4!=0){
                for(int j = 1;j<=n;j++){
                    if(j == n){
                        System.out.print("#");
                    }
                    else{
                        System.out.print(".");
                    }
                }
            }
            else if(i % 4 == 0){
                System.out.print("#");
                for(int j = 1;j<n;j++){
                    System.out.print(".");
                }
            }
            else{
                for(int j = 1;j<=n;j++){
                    System.out.print("#");
                }
            }
            System.out.println();
        }
    }
}
