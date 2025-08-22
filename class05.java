/*WAP in java to demonstrate local variable. */
import java.util.*;
class A {
    int x;
    int M(){
        int y = x; //local variable(y)
        return 2*y;
    }
}
public class  class05{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        A obj1 = new A();
        A obj2 = new A();

        obj1.x = sc.nextInt();
        obj2.x = sc.nextInt();
        sc.close();

        System.out.println(obj1.M());
        System.out.println(obj2.M());
    }
}