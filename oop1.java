class A {
    void animal(){
        System.out.println("DOG");
    }
}
class B extends A {
    void animal(){
        System.out.println("WOLF");
    }
    void man(){
        System.out.println("MAN");
    }
}

class oop1{
    public static void main(String args[]){
        A a = new B();
        B b = (B) a;
        b.man();
    }
}