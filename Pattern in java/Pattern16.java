public class Pattern16 {
    //Star butterfly pattern
    public static void main(String args[]){
        for(int i=1; i<=5; i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int k=1;k<=(10-2*i);k++){
                System.out.print(" ");
            }
            for(int l=1; l<=i;l++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int m=1;m<=5;m++){
            for(int n=1;n<=(5-m);n++){
                System.out.print("*");
            }
            for(int o=1;o<=(2*m);o++){
                System.out.print(" ");
            }
            for(int p=1;p<=(5-m);p++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
