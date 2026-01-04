public class Pattern10S {
    public static void main(String args[]){
        for(int i=1; i<=3; i++){
            for(int j=1; j<=(3-i); j++){
                System.out.print(" ");
            }
            for(int k=1; k<=(2*i-1); k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int l=1;l<=2; l++){
            for(int m=1; m<=l; m++){
                System.out.print(" ");
            }
            for(int n=1; n<=(5-2*l); n++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}
