import java.util.*;
public class binary_search{
    public static int search(int numbers[],int key){
        int start = 0;
        int end = numbers.length - 1;
        while(start <= end){
            int mid = (start + end)/2;
            
            if(numbers[mid] == key){
                return mid;
            }
            if(numbers[mid] > key){//left side search krne wala case..here ends changes
                end = end - 1;
            }
            if(numbers[mid] < key){//right side search krne wala case...here starts changes
                start = mid + 1;
            }
            
        }
        return -1;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int numbers[] = {12, 13, 16, 17, 20, 22}; //sorted array
        System.out.print("Enter number which we have to find: ");
        int key = sc.nextInt();

        System.out.println("number is found at " + search(numbers,key));
    }
}