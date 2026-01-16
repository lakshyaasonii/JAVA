import java.util.*;
public class Kadane {
    public static void kadane(int arr[]){
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE; //-infinite
        for(int i=0; i<arr.length; i++){
            currentSum = currentSum + arr[i];
            maxSum = Math.max(maxSum,currentSum);
            if(currentSum<0){
                currentSum = 0;
            }
            else{
                continue;
            }
        }
        System.out.println("max sum is: " + maxSum);
    }
    public static void main(String args[]){
        int array[] = {-2,-3,4,-1-2,1,5,-3};
        kadane(array);
    }
}
