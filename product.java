import java.util.*;
public class product {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        //input of first number
        System.out.print("Enter first number: ");
        float a = sc.nextFloat();

        //input of second number
        System.out.print("Enter second number: ");
        float b = sc.nextFloat();

        //product process
        float product;
        product = a*b;
        System.out.print(product);
        sc.close();

        
    }
}
