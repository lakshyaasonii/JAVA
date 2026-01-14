public class Pair02{
    public static void main(String args[]){
        int marks[] = {2,3,4,5,6,7,8,9,10};
        for(int i=0; i<marks.length; i++){
            for(int j=i+1; j<marks.length; j++){
                if(i%2 == 0 && j%2 !=0 ){
                    System.out.print("{"+ marks[i] + "," + marks[j] + "}" + "  ");
                }
            }
        }
    }
}