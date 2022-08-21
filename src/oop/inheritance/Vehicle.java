package oop.inheritance;

public class Vehicle {
    //Fields
    protected String brand;
    //Methods
    public void honk(){
        System.out.println("Tuut tuut");
        System.out.println("My brand is " + brand);
    }
}
//inside Bike there are all fields and methods  parent class
class Bike extends Vehicle{
    @Override
    public void honk() { //This is new honk method after override
        System.out.println("Pfff");;

    }

    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.honk();
        bike.brand = "Volvo";
        bike.honk();




    }

}