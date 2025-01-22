import java.util.Scanner;
public class beautifulmatrix {
    public static void main(String[] args) {
        int[][] matrix= new int[5][5];
        int row = 0;
        int column = 0;
        Scanner sc= new Scanner(System.in);
        for(int i = 0;i<5;i++){
            for(int j = 0;j<5;j++){
                matrix[i][j] = sc.nextInt();
                if(matrix[i][j] == 1){
                    row = i;
                    column = j;
                }
            }
        }
        int min_moves = Math.abs(row-2) + Math.abs(column-2);
        System.out.println(min_moves);
    }
}
