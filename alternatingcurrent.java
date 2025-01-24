import java.util.*;
public class alternatingcurrent {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Stack<Character> stack = new Stack<>();
        for(char c: s.toCharArray()){
            if(stack.isEmpty()){
                stack.push(c);
            }
            else if(stack.peek() == '+' && c == '+'){
                stack.pop();
            }
            else if(stack.peek() == '-' && c == '-'){
                stack.pop();
            }
            else{
                stack.push(c);
            }
        }
        System.out.println(stack.isEmpty() ? "Yes": "No");
    
    }
}
