import java.util.*;
public class prime {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number here: ");
        int n = sc.nextInt();
        sc.close();
        
        boolean isPrime = true; //maan lete hai ki number prime hai enter ke time
        for(int i=2;i<=n;i++){
            if(n%i ==0 ){
                isPrime = false; /*matlab ek bhi factor milte hi isPrime ki value false ho jayegi aur loop break ho jayega*/
                break;
            }
        }
        /*final check ,isPrime ki value ke basis par prime hai ki nhi ye batana*/
        if(isPrime == true){
            System.out.println("Enter number is the prime number");
        }
        else if(isPrime == false){
            System.out.println("Enter number is not the prime number");
        }

    }
}
