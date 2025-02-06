import java.util.*;
public class hellpfulmath{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        ArrayList<Integer> arr = new ArrayList<>();
        for(char ch:s.toCharArray()){
            if(ch!='+'){
                arr.add(ch-'0');
            }
        }
        Collections.sort(arr);
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<arr.size();i++){
            if(i != arr.size()-1){
                char ch = (char)(arr.get(i)+'0');
                sb.append(ch+"+");
            }
            else{
                char ch = (char)(arr.get(i)+'0');
                sb.append(ch);
            }
        }
        System.out.println(sb.toString());
    }
}