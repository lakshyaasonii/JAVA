/*WAP to create a Square class and create 2 objects, with different sides...*/
import java.util.*;
class Square{
    int side;
    int area(){
        return side*side;
    }
    int perimeter(){
        return 4*side;
    }
}

public class class02{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Square s1= new Square();//object01
        Square s2= new Square();//object02
        System.out.print("Enter the side of first square: ");
        s1.side = sc.nextInt();
        System.out.print("Enter the radius of the second Square: ");
        s2.side = sc.nextInt();
        sc.close();
        System.out.println("Area of Square having side "+ s1.side + " is " + s1.area());
        System.out.println("Area of Square having side "+ s2.side + " is " + s2.area());
        System.out.println("Perimeter of Square having side "+ s1.side + " is " + s1.perimeter());
        System.out.println("Perimeter of Square having side "+ s2.side + " is " + s2.perimeter());
    }
}