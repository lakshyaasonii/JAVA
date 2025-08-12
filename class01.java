import java.util.*;
 class Circle{
    float radius;
    float area(){
        return radius*radius*(3.14f);
    }
}

public class class01{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Circle c1 = new Circle();
        Circle c2 = new Circle();
        System.out.print("Enter radius of first circle: ");
        c1.radius = sc.nextInt();
        System.out.print("Enter radius of second circle: ");
        c2.radius = sc.nextInt();
        sc.close();

        System.out.println("Area of circle having radius " + c1.radius + " is " + c1.area());
        System.out.println("Area of circle having radius " + c2.radius + " is " + c2.area());
    }
}