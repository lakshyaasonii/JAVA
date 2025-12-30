import java.util.*;
public class array01 {
    public static void printing(int marks[]){
        for(int i=0; i < marks.length; i++){
            System.out.print(marks[i] + " ");
        }
    }
    public static void main(String args[]){
       int marks[] = {97, 98, 99, 76, 74};

        //calling of printing function to print the array..
        printing(marks);
    }
}