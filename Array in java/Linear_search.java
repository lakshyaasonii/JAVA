import java.util.*;
public class Linear_search {
    
    public static int search(int arr[],int key){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int marks[] = {10,20,30,40,50};
        int index = search(marks,30);
        if(index == -1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at index " + index);
        }
    }
}
