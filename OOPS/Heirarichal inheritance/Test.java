class Person{
    String name;
    int age;
    Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    void details(){
        System.out.println("name: " + this.name + "\n" + "age:" + this.age);
        return;
    }
}

class Student extends Person{
    int roll_no;
    Student(String name,int age,int roll_no){
        super(name,age);
        this.roll_no = roll_no;
    }
    void information(){
        System.out.println("Name: " + super.name + "\n" + "Age: " + super.age + "\n" + "Roll_no: " + this.roll_no);
        return;
    }
}

class Employee extends Person{
    int salary;
    Employee(String name,int age,int salary){
        super(name,age);
        this.salary = salary;
    }
    void information(){
        System.out.println("Name: " + super.name + "\n" + "Age: " + super.age + "\n" + "Salary " + this.salary);
        return;
    }
}

class Test{
    public static void main(String args[]){
        Person p = new Person("Yogesh Soni",50);
        p.details();
        
        Student s = new Student("Lakshya Soni",20,117);
        s.details();
        s.information();

        Employee e = new Employee("Munna",45, 21000);
        e.details();
        e.information();
    }
}