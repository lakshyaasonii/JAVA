/*WAP to print the largest of two numbers */
import java.util.*;

public class practice05{
    public static void main(String args[]){
        int A, B;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        A = sc.nextInt();
        System.out.print("Enter second number: ");
        B = sc.nextInt();
        sc.close();
        if(A>B){
            System.out.println(A + " is the largest number!");
        }
        if(A == B){
            System.out.println("Both numbers are equal");
        }
        else {
            System.out.println(B + " is the largest number");
        }

    }
}