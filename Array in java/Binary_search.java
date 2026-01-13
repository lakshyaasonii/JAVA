public class Binary_search {
    public static int search(int arr[],int key){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = (start + end)/2;
            if(arr[mid] == key){
                return mid;
            }
            else if(arr[mid] > key){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int marks[] = {20,40,60,80,100};
        int index = search(marks,80);
        if(index == -1){
            System.out.println("Element not found..");
        }
        else{
            System.out.println("Element found at index " + index);
        }
    }

}
