import java.util.*;
public class calculator{
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter first number: ");
       int a = sc.nextInt();
       System.out.print("Enter second number: ");
       int b = sc.nextInt();

       double percentage = (a*100 / b);
       System.out.println("Percentage is: " + percentage + "%");
       sc.close();
    }
}