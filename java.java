import java.util.*;
public class java{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int marks[][][] = new int[2][2][2];
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
               for(int k=0;k<2;k++){  
                marks[i][j][k] = sc.nextInt();
               }
            }
        }
        sc.close();
        System.out.print(marks[1][1][1]);
    }
}