import java.util.*;
public class nearlyluckynumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long number = sc.nextLong();
        long count = 0;
        while( number > 0){
            long rem = number % 10;
            if(rem == 4 || rem == 7){
                count++;
            }
            number = number / 10;
        }
        if(count == 4 || count == 7){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
    
}
