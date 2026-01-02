package OOPS.Polymorphism01;

class Maths{
    int sum(int a,int b){
        return (a+b);
    }
    int sum(int a,int b,int c){
        return (a+b+c);
    }
}

class Test{
    public static void main(String args[]){
        Maths m = new Maths();
        System.out.println(m.sum(20,30));
        System.out.println(m.sum(20,30,40));
    }
}