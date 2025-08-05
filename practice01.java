//WAP to find the area of the Circle if radius is given
import java.util.*;
public class practice01 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of the circle: ");
        float radius = sc.nextFloat();
        double area = 3.14 * radius * radius;
        System.out.print("For circle of " + radius + " area will become " + area );
        sc.close();
    }
}
