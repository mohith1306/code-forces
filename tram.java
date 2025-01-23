import java.util.*;
public class tram {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int minCount = 0;
        int count = 0;
        for(int i = 0; i<n;i++){
            int exit = sc.nextInt();
            int entry = sc.nextInt();
            count = count -exit + entry;
            if(count > minCount){
                minCount = count;
            }
        }
        System.out.println(minCount);
    }
}
