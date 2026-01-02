class A{
    String x;
    int y;
    double z;
    A(String x){ //constructor 01
        this.x = x;
    }
    A(String x,int y){ //constructor 02
        this.x = x;
        this.y = y;
    }
    A(String x, int y, double z){ //constructor 03
        this.x = x;
        this.y = y;
        this.z = z;
    }
    void details(){
        System.out.println(this.x + " " + this.y + " " + this.z);
        return;
    }
}

class Test{
    public static void main(String args[]){
        A a1 = new A("Lakshya Soni"); //constructor 01 wala object
        a1.details();
        A a2 = new A("Lakshya Soni",20); //constructor 02 wala object
        a2.details();
        A a3 = new A("Lakshya Soni", 20, 117.258); //constructor 03 wala obbject
        a3.details();
    }
}