public class Pattern13{
    //Diamond pattern
    public static void main(String args[]){
        for(int i=1; i<=5; i++){
            for(int j=1;j<=(5-i);j++){
                System.out.print(" ");
            }
            for(int k=1;k<=(2*i-1);k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int l=1;l<=4;l++){
            for(int m=1;m<=l; m++){
                System.out.print(" ");
            }
            for(int n=1; n<=(9-2*l);n++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}