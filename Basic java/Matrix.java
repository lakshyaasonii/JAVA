import java.util.*;
public class Matrix{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the matrix: ");
        int n = sc.nextInt();
        int matrix[][] = new int[n][n];
        System.out.println("Enter elements of the matrix: ");
        for(int i=0;i<n;i++){
            for(int j=0; j<n;j++){
                matrix[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        //printing of matrix
        for(int k=0; k<n;k++){
            for(int l=0;l<n;l++){
                System.out.print(matrix[k][l] + " ");
            }
            System.out.println();
        }
    }
}