import java.util.*;
public class Input {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[5];
        System.out.print("Enter elements of the array: ");
        for(int i=0; i<5; i++){
            marks[i] = sc.nextInt();
        }
        sc.close();
        System.out.print("Array is: ");
        //printing of array
        for(int i=0; i<5; i++){
            System.out.print(marks[i] + " ");
        }
    }
}
