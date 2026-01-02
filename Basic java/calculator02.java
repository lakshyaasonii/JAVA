import java.util.*;
public class calculator02{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("Symbols: ");
        System.out.println("Sum --> 1" + "\n" + "difference --> 2" + "\n" + "multiply --> 3" + "\n" + "Divide --> 4" +"\n" + "Percentage --> 5");
        System.out.println("Enter symbol value: ");
        int operator = sc.nextInt();

        switch (operator){
            case 1:
                System.out.println("Sum is: " +(a+b));
                break;
            case 2:
                System.out.println("Difference is: " + (a-b));
                break;
            case 3:
                System.out.println("Product is: " + (a*b));
                break;
            case 4:
                if(b != 0){
                    System.out.println("Divide is: " + (a/b)); 
                    break;
                }
                else{
                    System.out.println("b is invalid for division");
                    break;
                }
            case 5:
                System.out.println("Percentage is: " + (a*100/b) + "%");
                break;
            default:
                System.out.println("Invalid operator is given...");
                break;
        }
        }
    }
}
