import java.util.*;
public class array_code{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[5];
        for(int i=0; i<5; i++){
            marks[i] = sc.nextInt();
            System.out.print(i + " ");
        }
        sc.close();
    }
}