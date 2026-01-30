class VehicleClass{
    void display(){
        System.out.println("Vehicle Class");
    }
}
class Car extends VehicleClass{
    void displayCar(){
        System.out.println("Car");
    }
}
class Bike extends VehicleClass{
    void displayBike(){
        System.out.println("Bike");
    }
}

public class Vehicle {
    public static void main(String[] args) {
        Car c=new Car();
        Bike b=new Bike();

        c.display();c.displayCar();
        b.display();b.displayBike();
    }
}
