import java.util.*;
public class binomial{
    public static int factorial(int n){
        int multiply = 1;
        for(int i=0; i<=n; i++){
            multiply = multiply*i;
        }
        return multiply;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.print("Enter the value of the r: ");
        int r = sc.nextInt();
        sc.close();
        int coefficient = (factorial(n) / (factorial(r)*factorial(n-r)));
        System.out.println("Coefficient is: " + coefficient);
    }
}