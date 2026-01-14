public class Practice02 {
    public static void Print(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String args[]){
        int array[] = {2,4,7,1,12,10};
        int prefix[] = new int[array.length];

        prefix[0] = array[0];
        for(int i=1; i<array.length; i++){
            prefix[i] = prefix[i-1]*array[i];
        }

        Print(prefix);
    }
}
