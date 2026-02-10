class Car {
    void display() {
        System.out.println("This is a car.");
    }
}
class SportsCar extends Car {
    @Override
    void display() {
        System.out.println("This is a sports car.");
    }
}
class ElectricCar extends Car {
    @Override
    void display() {
        System.out.println("This is an electric car.");
    }
}


public class Overriding_Assignment2 {
    public static void main(String[] args) {
      
        Car c1 = new SportsCar();
        Car c2 = new ElectricCar();
        Car c3 = new Car();

        c1.display(); 
        c2.display(); 
        
    }
}               