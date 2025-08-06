//In a program, input 3 numbers: A, B & C. You have to output the average of these 3 numbers
import java.util.*;
public class practice02 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int A = sc.nextInt();
        System.out.print("Enter second number: ");
        int B =  sc.nextInt();
        System.out.print("Enter third number: ");
        int C = sc.nextInt();
        sc.close();
        int average = (A+B+C)/3;
        System.out.println("Average of "+ A + ","+ B + "," + C + " is " + average);
    }
}