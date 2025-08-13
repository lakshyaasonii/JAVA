/*WAP in java to create a car class and create two objects of car class */
import java.util.*;
class Car{
    String name;
    int number_of_gears;
    String colour;
    void details(){
        System.out.println("the car having name " + name + " and colour " + colour + " having " + number_of_gears + " number of gears...");
        return;
    }

}
public class class04 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Car c1 = new Car(); //object01
        Car c2 = new Car(); //object02
        System.out.print("Enter the name of the first car: ");
        c1.name = sc.nextLine();
        System.out.print("Enter the name of the second car: ");
        c2.name = sc.nextLine();
        System.out.print("Enter the colour of the first car: ");
        c1.colour = sc.nextLine();
        System.out.print("Enter the colour of the second car: ");
        c2.colour = sc.nextLine();
        System.out.print("Enter number of gears present in first car: ");
        c1.number_of_gears = sc.nextInt();
        System.out.print("Enter number of gears present in second car: ");
        c2.number_of_gears = sc.nextInt();
        sc.close();
        
        //final calling or printing
        c1.details();
        c2.details();
    }
}
