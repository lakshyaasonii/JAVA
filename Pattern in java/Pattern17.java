public class Pattern17 {
    public static void main(String args[]){
        //number V fittig shape
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int k=1;k<=(10-2*i);k++){
                System.out.print(" ");
            }
            int count = i;
            for(int l=1;l <=i;l++){
                System.out.print(count);
                count--;
            }
            System.out.println();
        }
    }
}
