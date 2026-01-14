public class Practice01{
    public static void print(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String args[]){
        int array[] = {2,4,7,1,12,10};
        int prefix[] = new int[array.length];

        int multiply = 1;
        for(int i=0; i<array.length; i++){
            multiply = multiply * array[i];
            prefix[i] = multiply;
        }

        print(prefix);
    }
}