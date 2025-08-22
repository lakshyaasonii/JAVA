import java.util.*;
public class factorial{
    public static int factorial(int n){
        int multiply = 1;
        for(int i=1;i<=n;i++){
            multiply = multiply*i;
        }
        return multiply;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = sc.nextInt();
        sc.close();
        System.out.println("Fcatorial of " + number + " is " + factorial(number));
    }
}