public class Practice03 {
    public static void maxmultiply(int arr[]){
        int MaxMultiply = Integer.MIN_VALUE;
        for(int i=0; i<arr.length;i++){
            int start = i;
            for(int j=i; j<arr.length; j++){
                int end = j;
                int multiply = 1;
                for(int k=start; k<=end; k++){
                    multiply = multiply * arr[k];
                }
                System.out.println(multiply);
                if(MaxMultiply < multiply){
                    MaxMultiply = multiply;
                }
            }
        }
        System.out.println("Maximum multiplication of Subarray elements is: " + MaxMultiply);
    }

    public static void main(String args[]){
        int array[] = {2,4,5,1,3,6};
        maxmultiply(array);
    }
}
