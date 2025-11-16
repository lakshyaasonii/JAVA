/*LARGEST NUMBER*/
import java.util.*;
public class array02{
    public static int getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<numbers.length; i++){
            if(numbers[i] > largest){
                largest = numbers[i];
                
            }
            
        }
        return largest;

    }
    public static void main(String args[]){
        int numbers[] = {12, 14, 15, 7, 8, 90, 23};
        System.out.print("largest number is " + getLargest(numbers));
    }
}