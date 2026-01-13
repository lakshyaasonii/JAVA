public class Prog01 {
    public static void update(int arr[]){
        for(int i=0; i<arr.length; i++){
            arr[i] ++;
        }
        return;
    }
    public static void print(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        return;
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5};
        update(arr);
        print(arr);
    }
}
