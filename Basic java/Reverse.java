import java.util.*;
public class Reverse{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string here: ");
        String name = sc.next();
        String rev = " ";
        for(int i= (name.length() - 1); i>=0; i--){
            rev = rev + name.charAt(i);
        }
       System.out.println("Reverse of the string is: " + rev);
       sc.close();
    }
}