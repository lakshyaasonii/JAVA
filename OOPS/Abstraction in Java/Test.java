abstract class Animal{
    abstract void sound(); //abstract method 
    void sleep(){ //concrete method
        System.out.println("Animal sleeps");
        return;
    }
}

class Dog extends Animal{
    public void sound(){
        System.out.println("Dog barks");
        return;
    }
}

class Cat extends Animal{
    public void sound(){
        System.out.println("Cat meows");
        return;
    }
}

class Test{
    public static void main(String args[]){
        Animal a = new Dog();
        a.sound();
        Animal b = new Cat();
        b.sound();
    }
}