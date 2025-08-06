/*Enter cost of 3 items from the user (using float data type) - a pencil, a pen and an eraser. You have to output the total cost as a bill */
import java.util.*;
public class practice04 {
    public static void main(String args[]){
        float pen, pencil, eraser, cost;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the cost of pencil: ");
        pen = sc.nextFloat();
        System.out.print("Enter the cost of pen: ");
        pencil = sc.nextFloat();
        System.out.print("Enter the cost of eraser: ");
        eraser = sc.nextFloat();
        sc.close();
        cost = pen + pencil + eraser;
        System.out.println("Total bill is: " + cost);
    }
}