public class Pattern06 {
    public static void main(String args[]){
        for(int i=1; i<=5; i++){
            for(int j=0; j<=(i-1);j++){ //space
                System.out.print(" ");
            }
            for(int k=1; k<=(6-i); k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
