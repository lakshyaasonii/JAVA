package OOPS.Polymorphism02;

class Animal{
    void sound(){
        System.out.println("Animal sounds");
        return;
    }
}

class Cat extends Animal{
    void sound(){
        System.out.println("Cat meows");
        return;
    }
}

class Dog extends Animal{
    void sound(){
        System.out.println("Dog barks");
        return;
    }
}

public class Test {
    public static void main(String args[]){
        //jiska constructor usi ka method call hoga (simple rule hai java me)
        Animal a = new Animal();
        a.sound();  //animal sounds

        Animal a1 = new Cat(); //upcasting
        a1.sound(); //cat meows

        Animal a2 = new Dog(); //upcasting
        a2.sound(); //Dog barks
    }
}
