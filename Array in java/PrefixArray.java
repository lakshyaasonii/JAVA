public class PrefixArray {
    public static void print(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String args[]){
        int arr[] = {1,-2,6,-1,3};
        int prefix[] = new int[arr.length];

        for(int i=0 ;i<arr.length; i++){
            int sum = 0;
            for(int j=0 ;j<=i; j++){
                sum = sum + arr[j];
            }
            prefix[i] = sum;
        }

        print(prefix);
    }
}
