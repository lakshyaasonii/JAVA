import java.util.*;
public class Pattern21 {
    //Hollow rhombus pattern
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the pattern: ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){ 
            //space
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            //rhombus
            for(int k=1; k<=n; k++){
                if(i == 1 || i == n || k == 1 || k == n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
