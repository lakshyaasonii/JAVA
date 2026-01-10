import java.util.*;
public class sum01 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            sum = sum + i;
        }
        System.out.println(sum);
        sc.close();
    }
}
