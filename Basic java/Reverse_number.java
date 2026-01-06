import java.util.*;
public class Reverse_number {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number here: ");
        int n = sc.nextInt();
        int rev = 0;
        int digit;
        while(n>0){
           digit = n%10;
           rev = rev*10 + digit;
           n = n/10;
        }
        System.out.print("Reverse of the given number is: ");
        System.out.print(rev);
    }
}
