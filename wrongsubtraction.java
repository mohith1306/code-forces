import java.util.*;
public class wrongsubtraction{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        long k = sc.nextLong();
        for(int i = 0;i<k;i++){
            if(num % 10 == 0){
                num = num / 10;
            }
            else{
                num = num-1;
            }
        }
        System.out.println(num);
    }
}
// 1000000000 9
