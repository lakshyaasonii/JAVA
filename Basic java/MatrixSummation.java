import java.util.Scanner;

public class MatrixSummation {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of first matrix: ");
        int m1 = sc.nextInt();
        int n1 = sc.nextInt();
        int matrix01[][] = new int[m1][n1];
        System.out.print("Enter size of second matrix: ");
        int m2 = sc.nextInt();
        int n2 = sc.nextInt();
        int matrix02[][] = new int[m2][n2];

        //input of matrix01
        System.out.println("Enter elements of first matrix: ");
        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n1; j++) {
                matrix01[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        // printing of matrix01
        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n1; j++) {
                System.out.print(matrix01[i][j] + " ");
            }
            System.out.println();
        }

        //input of matrix02
        System.out.println("Enter elements of second matrix: ");
        for (int i = 0; i < m2; i++) {
            for (int j = 0; j < n2; j++) {
                matrix02[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        //printing of matrix02
        for(int i=0; i<m2; i++){
            for(int j=0; j<n2; j++){
                System.out.print(matrix02[i][j] + " ");
            }
            System.out.println();
        }

        // summation
        int summation[][] = new int[m1][n1];
        if (m1 != m2 || n1 != n2) {
            System.out.println("Matrix summation is not possible...");
        } else {
            for (int i = 0; i < m1; i++) {
                for (int j = 0; j < n1; j++) {
                    summation[i][j] = matrix01[i][j] + matrix02[i][j];
                }
                System.out.println();
            }
            System.out.println("Summation of matrix is: ");
            for (int i = 0; i < m1; i++) {
                for (int j = 0; j < n1; j++) {
                    System.out.print(summation[i][j] + " ");
                }
                System.out.println();
            }
        }

    }
}