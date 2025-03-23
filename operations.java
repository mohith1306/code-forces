import java.util.*;
public class operations{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        for(int i=0;i<n;i++){
            int a,b,z;
            a = sc.nextInt();
            b = sc.nextInt();
            z = sc.nextInt();
            int count = 0;
            while(a <= z && b <= z ){
                if(a < b){
                    a+=b;
                    count++;
                }
                else{
                    b += a;
                    count++;
                }
            }
            System.out.println(count);
        }
        sc.close();
    }
}