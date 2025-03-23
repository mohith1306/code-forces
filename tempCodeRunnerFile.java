import java.util.*;
public class cdandpwd{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<String> stack = new Stack<>();
        stack.push("/");
        for(int i=0;i<n;i++){
            String str = sc.next();
            if(str.equals("pwd")){
                if(stack.size() == 1){
                    System.out.println("/");
                }
                else{
                    for(int j=0;j<stack.size();j++){
                        System.out.println("/");
                        System.out.println(stack.get(j));
                        System.out.println("/");
                    }
                }
            }
            else if(str.substring(0,2).equals("cd")){
                String[] direcs = str.split("/");
                for(int j=0;j<direcs.length;j++){
                    if(direcs[j].equals("..")){
                        stack.pop();
                    }
                    else{
                        stack.push(direcs[j]);
                    }
                }   
            }
        }
        sc.close();
    }
}