import java.util.*;
public class way_too_long_words {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            String word = sc.nextLine();
            if(word.length() > 10){
                String abbreviation = word.charAt(0) + String.valueOf(word.length() - 2) + word.charAt(word.length() - 1);
                System.out.println(abbreviation);
            }
            else{
                System.out.println(word);
            }
        }
    }
}
