public class Leftmax {
    public static void leftmaxArray(int arr[]){
        int leftmax[] = new int[arr.length];
        leftmax[0] = arr[0];
        for(int i=1; i<arr.length;i++){
            leftmax[i] = Math.max(leftmax[i-1],arr[i]);
        }
        //print
        for(int i=0; i<leftmax.length; i++){
            System.out.print(leftmax[i] + " ");
        }
    }
    public static void main(String args[]){
        int array[] = {1,4,2,7};
        leftmaxArray(array);
    }

}
