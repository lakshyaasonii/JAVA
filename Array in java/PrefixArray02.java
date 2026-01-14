//prefix[i] = prefix[i-1] + array[i] //concept
public class PrefixArray02 {
    public static void print(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String args[]){
        int arr[] = {1, -2, 6, -1, 3};
        int prefix[] = new int[arr.length];

        prefix[0] = arr[0];
        for(int i=1; i<arr.length; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        print(prefix);
    }
}
