public class Rightmax {
    public static void rightmaxArray(int arr[]){
        int rightmax[] = new int[arr.length];
        rightmax[arr.length-1] = arr[arr.length-1];
        for(int i=arr.length-2; i>=0; i--){
            rightmax[i] = Math.max(rightmax[i+1],arr[i]);
        }
        //print
        for(int i=0; i<rightmax.length; i++){
            System.out.print(rightmax[i] + " ");
        }
    }
    public static void main(String args[]){
        int array[] = {2,4,6,1,3};
        rightmaxArray(array);
    }
}
