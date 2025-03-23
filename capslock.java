import java.util.*;
public class capslock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        if (s.equals(s.toUpperCase()) || (Character.isLowerCase(s.charAt(0)) && s.substring(1).equals(s.substring(1).toUpperCase()))) {
            System.out.println(s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase());
        } else {
            System.out.println(s);
        }
    }
}
