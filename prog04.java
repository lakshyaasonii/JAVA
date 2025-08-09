import java.util.*;
public class prog04{
    public static void main(String args[]){
        int age;
        
        Scanner sc = new Scanner(System.in);
       
        System.out.print("Enter the age of the person: ");
        age = sc.nextInt();

        sc.close();

        if(age>=18){
            System.out.println("person is eligible for voting!");
        }
        else {
            System.out.println("person is not eligible for voting");
        }
    }
}