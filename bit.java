import java.util.*;
public class bit{
    public static void main(String[] args){

        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int x = 0;
        String[] operations = new String[n];
        for(int i = 0; i < n ; i++){
            operations[i] = sc.next();
        }

        for(int i = 0; i<n;i++){
            if(operations[i].contains("++")){
                x++;
            }
            else{
                x--;
            }    
        }
        System.out.println(x);

    }
}