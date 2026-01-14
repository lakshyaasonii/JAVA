public class Pattern10 {
    //Diamond pattern
    public static void main(String args[]){
        for(int i=1; i<=3; i++){ //upper triangle
            for(int j=1; j<=(3-i); j++){ 
                System.out.print(" ");
            }
            for(int k=1; k<=i;k++){
                System.out.print("*");
            }
            for(int l=1;l<=(i-1);l++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int m=1; m<=2;m++){ //lower triangle
            for(int n=1; n<=m; n++){
                System.out.print(" ");
            }
            for(int o=1; o<=(3-m);o++){
                System.out.print("*");
            }
            for(int p=1; p<=(2-m); p++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
