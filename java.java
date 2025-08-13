import java.util.*;
public class java{
   

 public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of elements present in array: ");
    int n = sc.nextInt();
    int marks[] = new int[n];
    for(int i=0;i<n;i++){
        marks[i] = sc.nextInt();
    }
    System.out.print(Arrays.toString(marks));
    
 }
}