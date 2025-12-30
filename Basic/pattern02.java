import java.util.*;
public class pattern02 {
    public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter size of square: ");
        n = sc.nextInt();
        sc.close();
        for(int line=1;line<=n;line++){
            for(int star=1;star<=n;star++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
