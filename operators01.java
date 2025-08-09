import java.util.*;
public class operators01 {
    public static void main(String args[]){
        float A, B, sum, multiply, divide, subtract, modulo;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        A = sc.nextFloat();
        System.out.print("Enter second number: ");
        B = sc.nextFloat();
        sc.close();

        sum = (A + B);
        subtract = (A - B);
        multiply = (A*B);
        divide = (A/B);
        modulo = (A%B);

        System.out.println("Sum of " + A + " and " + B + " is " + sum);
        System.out.println("Difference of " + A + " and " + B + " is " + subtract);
        System.out.println("Product of " + A + " and " + B + " is " + multiply);
        System.out.println("Divide of " + A + " and " + B + " is " + divide);
        System.out.println("Modulo of " + A + " and " + B + " is " + modulo);

    }
}