public class java{
    public static int function(int arr[]){
        int num = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] >num){
                num = arr[i];
            }
        }
    }
    public static void main(String args[]){
        int arr[] = {5, 7, 11, 6, 2};
    }
}