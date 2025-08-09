import java.util.*;
public class calculator {
    public static void main(String args[]){
        char operator;
        int A, B;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        A = sc.nextInt();
        System.out.print("Enter operator: ");
        operator = sc.next().charAt(0);
        System.out.print("Enter second number: ");
        B = sc.nextInt();
        sc.close();

        //logic
        switch (operator){
            case '+': System.out.print(A+B);
            break;
            case '-' : System.out.print(A-B);
            break;
            case '*' : System.out.print(A*B);
            break;
            case '/' : System.out.print(A/B);
            break;
            case '%' : System.out.print(A%B);
            break;

            default: System.out.println("Invalid operator is given!!");
        }
    }
}
