import java.util.*;
public class Smallest {
    public static void smallest(int arr[]){
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] < smallest){
                smallest = arr[i];
            }
            else{
                continue;
            }
        }
        System.out.println("Smallest elemnt is: " + smallest);
    }
    public static void main(String args[]){
        int marks[] = {100,51,87,98,52};
        smallest(marks);
    }
}
