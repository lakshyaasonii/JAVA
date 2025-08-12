/*WAP to create a Student class and also create two different objects of student class and then calculate its percentage */
import java.util.*;
class Student{
    String name;
    int obtained_marks;
    int total_marks = 120;
    float percentage(){
        return (obtained_marks*100)/total_marks;
    }
}

public class class03{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student();//object01
        Student s2 = new Student();//object02
        System.out.print("Enter the name of first student: ");
        s1.name = sc.nextLine();
        System.out.print("Enter the name of second student: ");
        s2.name = sc.nextLine();
        System.out.print("Enter the obtained marks of first student: ");
        s1.obtained_marks = sc.nextInt();
        System.out.print("Enter the obtained marks of second student: ");
        s2.obtained_marks = sc.nextInt();
        sc.close();
        System.out.println("Percentage obtained by "+ s1.name + " is " + s1.percentage() + "%");
        System.out.println("Percentage obtained by "+ s2.name + " is " + s2.percentage() + "%");
    }
}