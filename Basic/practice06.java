/*WAP to check the number is even or odd */
import java.util.*;
public class practice06{
    public static void main(String args[]){
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        num = sc.nextInt();

        if(num%2 == 0){
            System.out.println(num + " is even");
        }
        else {
            System.out.println(num + " is odd");
        }
    }
}