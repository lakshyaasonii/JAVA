class Car{
    String name;
    int no_of_gears;
    String color;
    Car(String name,int no_of_gears,String color){
        this.name = name;
        this.no_of_gears = no_of_gears;
        this.color = color;
    }
    void details(){
        System.out.println("Name: " + this.name + "\n" + "Number of gears: " + this.no_of_gears + "\n" + "color: " + this.color);
        return;
    }
}

class Test{
    public static void main(String args[]){
        Car BMW = new Car("BMW",5,"Black"); //first object
        BMW.details();

        Car buggati = new Car("buggati",4,"Red");
        buggati.details();

        Car mercredies = new Car("mercredies",6,"Grey");
        mercredies.details();
    }
}