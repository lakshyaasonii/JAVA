interface Animal{
    abstract void sound();
    abstract void size();
}

class Dog implements Animal{
    public void sound(){
        System.out.println("Dog barks");
        return;
    }
    public void size(){
        System.out.println("Dog is big");
        return;
    }
}

class Test{
    public static void main(String args[]){
        Animal a = new Dog();
        a.sound();
        a.size();
    }
}