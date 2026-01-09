import java.util.Scanner;

class Matrix{
    int m,n;
    int matrix[][];
    Matrix(int m, int n){
        this.m = m;
        this.n = n;
         matrix = new int[m][n];
    }
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements of the matrix: ");
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                matrix[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        sc.close();
    }
    void display(){
        System.out.println("MATRIX is: ");
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    void trace(){
        if(m != n){
            System.out.println("Matrix is not square..");
        }
        else{
            int sum = 0;
            for(int i=0; i<m; i++){
                    sum = sum + matrix[i][i];
            }
            System.out.println("Sum of diagonal element is " + sum);
        }
    }
    void border(){
        System.out.println("Border element of the matrix..");
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(i==0 || i==(m-1) || j==0 || j==(n-1)){
                    System.out.print(matrix[i][j] + " ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    void sum(){
        int sum = 0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                sum = sum + matrix[i][j];
            }
        }
        System.out.println("Sum of all elements of the matrix" + sum);
    }
    void transpose(){
        int transpose[][] = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                transpose[i][j] = matrix[j][i];
            }
            System.out.println();
        }
        //printing of transpose
        System.out.println("Transpose of the matrix is: ");
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}
    
public class Test {
    public static void main(String args[]){
        Matrix m1 = new Matrix(3,3);
        m1.input();
        m1.display();
        m1.trace();
        m1.border();
        m1.sum();
        m1.transpose();
    }
}
