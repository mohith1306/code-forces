import java.util.*;
public class polyhedrons {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for(int i =0 ;i<n ;i++){
            String s = sc.next();
            if(s.equals("Tetrahedron")){
                count+=4;
            }
            else if(s.equals("Cube")){
                count+=6;
            }
            else if(s.equals("Octahedron")){
                count+=8;
            }
            else if(s.equals("Dodecahedron")){
                count+=12;
            }
            else if(s.equals("Icosahedron")){
                count+=20;
            }
        }
        System.out.println(count);
    }
}
