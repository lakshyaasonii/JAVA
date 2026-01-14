public class Practice04 {
    public static void maxmultiply(int arr[]){
        int maxmultiply = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for(int i=1; i<arr.length; i++){
            prefix[i] = prefix[i-1]*arr[i];
        }
        
        for(int i=0; i<arr.length; i++){
            int start = i;
            for(int j=i; j<arr.length; j++){
                int end = j;
                int multiply;
                if(start == 0){
                    multiply = prefix[end];
                }
                else{
                    multiply = prefix[end] / prefix[start-1];
                }
                System.out.println(multiply);
                if(maxmultiply < multiply){
                    maxmultiply = multiply;
                }
            }   
        }
        System.out.println("maximum subarray multiplication is: " + maxmultiply);
    }
    public static void main(String args[]){
        int array[] = {2,4,5,1,3,6}; // element having value 0 is not allowed 
        maxmultiply(array);
    }
}
