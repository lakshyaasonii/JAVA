class Person{
    String name;
    int age;
    Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    void details(){
        System.out.println("name: " + this.name + " age: " + this.age);
        return;
    }
}

class Student extends Person{
    String branch;
    int roll_no;
    Student(String name,int age,String branch,int roll_no){
        super(name,age);
        this.branch = branch;
        this.roll_no = roll_no;
    }
    void information(){
        System.out.println("name: " + super.name + " age: " + super.age + " branch: " + this.branch + " roll_no: " + this.roll_no);
        return;
    }
}

class Test{
    public static void main(String args[]){
        Person p = new Person("Lakshya Soni",20); //object of Person class
        p.details();
        Student s = new Student("Manish Soni",21,"CSE",117); //object of Student class
        s.details();
        s.information();
    }
}