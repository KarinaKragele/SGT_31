package oop;

public class Car {

    //We need to define fileds
    private String color;
    private String brand;
    private int maxSpeed;

    //And methods
    //Setter methods

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    public void setColor(String color){
        this.color = color;
    }
    //Getter methods

    public String getBrand() {
        return brand;
    }
    public int getMaxSpeed() {
        return maxSpeed;
    }
    public String getColor(){
        return color;
    }
    public void printCarInfo(){
        System.out.println("Car info: ");
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Maximum speed: "+ maxSpeed);
    }
}
