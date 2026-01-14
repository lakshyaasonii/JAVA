public class MaxSubarraySum {
    public static void MaxSum(int arr[]){
        //subarray + sum of subarray elements + largest of the sum (sabhi subarray ka sum nikalne ke baad unme se konsa sum sabse bada hai ye compare krna hai)
        int maxSum = Integer.MIN_VALUE; //-infinity
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                int sum = 0;
                for(int k=i; k<=j;k++){
                    sum = sum + arr[k];
                }
                System.out.println(sum);
                if(maxSum < sum){
                    maxSum = sum;
                }
            }
        }
        System.out.println("Maximum Sum of subarray is: " + maxSum);
        
    }

    public static void main(String args[]){
        int array[] = {10,12,24,13,56,7,8};
        MaxSum(array);
    }
}
