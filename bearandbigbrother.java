import java.util.*;
public class bearandbigbrother {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int weightOfLimak = sc.nextInt();
        int weightOfBob = sc.nextInt();
        int count = 0;
        while(weightOfLimak <= weightOfBob){
            weightOfLimak *= 3;
            weightOfBob *= 2;
            count++;
        }
        System.out.println(count);
    }
}
