/*WAP to find the greatest of three numbers */
import java.util.*;
public class practice07{
    public static void main(String args[]){
        int A, B, C;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        A = sc.nextInt();
        System.out.print("Enter second number: ");
        B = sc.nextInt();
        System.out.print("Enter third number: ");
        C = sc.nextInt();
        sc.close();

        if(A>B && A>C){
            System.out.println(A + " is the greatest number.");
        }
        else if(B>A && B>C){
            System.out.println(B + " is the greatest number.");
        }
        else {
            System.out.println(C + " is the greatest number.");
        }
    }
}