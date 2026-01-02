class Grandparent{
    String grandparent_name;
    int grandparent_age;
    Grandparent(String a,int b){
        grandparent_name = a;
        grandparent_age = b;
    }
    void details01(){
        System.out.println("Grandparent name: " + grandparent_name + "\n Grandparent age: " + grandparent_age);
        return;
    }
}

class Parent extends Grandparent{
    String parent_name;
    int parent_age;
    Parent(String a,int b,String c,int d){
        super(a,b);
        parent_name = c;
        parent_age = d;
    }
    void details02(){
        System.out.println("Grandparent name: " + super.grandparent_name + "\n Grandparent age: " + super.grandparent_age + "\n Parent name: " + parent_name + "\n Parent age: " + parent_age);
        return;
    }
}

class Child extends Parent{
    String child_name;
    int child_age;
    Child(String a, int b, String c,int d,String e,int f){
        super(a,b,c,d);
        child_name = e;
        child_age = f;
    }
    void details03(){
        System.out.println("Grandparent name: " + super.grandparent_name + "\n Grandparent age: " + super.grandparent_age + "\n Parent name: " + parent_name + "\n Parent age: " + parent_age + "\n Child name: " + child_name + "\n Child age: " + child_age);
        return;
    }
}

class Test{
    public static void main(String args[]){
        Grandparent gp = new Grandparent("Niranjan Soni", 80);
        gp.details01();

        Parent p = new Parent("Niranjan Soni",80 , "Yogesh Soni", 50);
        p.details01();
        p.details02();

        Child c = new Child("Niranjan Soni", 80, "Yogesh Soni", 50, "Lakshya Soni", 20);
        c.details01();
        c.details02();
        c.details03();
    }
}