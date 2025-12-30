/*WAP to check the number is even or odd using ternary operator */
import java.util.*;
public class ternary{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number here: ");
        int number = sc.nextInt();
        sc.close();

        //logic
        String answer = (number % 2 == 0) ? "even" : "odd" ;
        System.out.println(answer); 
    }
}