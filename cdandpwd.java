import java.util.*;
public class cdandpwd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // List<String> path = new ArrayList<>();
        Stack<String> path = new Stack<>();
        for(int i = 0;i<n;i++){
            String s = sc.next();
            if(path.isEmpty() && s.equals("pwd")){
                System.out.println("/");
            }

        }
    })
    
}
