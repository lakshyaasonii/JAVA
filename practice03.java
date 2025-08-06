//In a program, input the side of a square. You have to output the area of the square
import java.util.*;
public class practice03 {
    public static void main(String args[]){
        int side, area;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side of the square: ");
        side = sc.nextInt();
        sc.close();
        area = side * side;
        System.out.print("The area of the square having side lenght " + side + " is " + area);
    }
}