/*WAP to find the sum of first n natural numbers using loop */
import java.util.*;
public class practice08 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n;
        n = sc.nextInt();
        sc.close();
        int sum = 0;
        for(int i=0;i<=n;i++){
            sum = sum +i;
        }
        System.out.println("Sum of numbers is: " + sum);
    }
    
}
