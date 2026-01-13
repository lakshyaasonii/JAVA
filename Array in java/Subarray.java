public class Subarray{
    public static void main(String args[]){
        int marks[] = {2,4,6,8,10};
        for(int i=0; i<marks.length; i++){
            for(int j=i; j<marks.length;j++){
                System.out.print("{");
                for(int k=i; k<=j; k++){
                    System.out.print(marks[k] + " ");
                }
                System.out.print("}");
                System.out.println();
            }
        }
    }
}