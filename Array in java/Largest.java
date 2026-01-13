import java.util.*;
public class Largest {
    public static void largest(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
            else{
                continue;
            }
        }
        System.out.println("Largest element in array is: " + largest);
    }
    public static void main(String args[]){
        int number[] = {10,20,25,7,11,22};
        largest(number);
    }
}
