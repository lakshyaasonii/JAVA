class Person01{
    String name;
    int age;
    Person01(String a,int b){
        name = a;
        age = b;
    }
    void details(){
        System.out.println("name: " + name + " age: " + age);
        return;
    }
}

class Student01 extends Person01{
    int roll_no;
    Student01(String a,int b,int x){
        super(a,b);
        roll_no = x;
    }
    void information(){
        System.out.println("name: " + super.name + " age: " + super.age + " roll_no " + this.roll_no);
        return;
    }
}

class Test01{
    public static void main(String args[]){
        Person01 p1 = new Person01("Lakshya Soni",20);
        p1.details();
        Student01 s1 = new Student01("Rahul yadav",22,160);
        s1.details();
        s1.information();
    }
}

