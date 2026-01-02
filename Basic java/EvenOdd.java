import java.util.*;
class EvenOdd{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
       while(true){
        System.out.print("Enter number here: ");
         int num = sc.nextInt();
         if(num % 2 == 0){
            System.out.println(num + " is even number...");
         }
         else {
            System.out.println(num + " is odd number...");
        }
       }
    }
}