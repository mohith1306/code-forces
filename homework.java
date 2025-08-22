import java.util.*;
public class homework{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=0;i<T;i++){
            int lenA = sc.nextInt();
            String a = sc.next();
            int lenB = sc.nextInt();
            String b = sc.next();
            String c = sc.next();
            StringBuilder v = new StringBuilder();
            StringBuilder d = new StringBuilder();
            for(int j=0;j<lenB;j++){
                if(c.charAt(j) == 'V'){
                    v.append(b.charAt(j));
                }
                else{
                    d.append(b.charAt(j));
                }
            }
            v.reverse();
            String ans = v + a + d;
            System.out.println(ans);
            // System.out.println(d);
            // System.out.println(v);
        }
    }
}