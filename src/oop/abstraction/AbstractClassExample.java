package oop.abstraction;

abstract class Animal{
    protected String name;
    public void sleep(){ //this method will not return anything
        System.out.println("zzzzzz");
    }
    public abstract void animalSound();
}
class Pig extends Animal{
    public void animalSound(){
        System.out.println("Oink oink");
    }

}
class Dog extends Animal{
    public void animalSound(){
        System.out.println("Bark Bark");
    }
}

public class AbstractClassExample {
    public static void main(String[] args) {
       // Animal animal = new Animal() {}

        Pig pig = new Pig();
        pig.sleep();
        pig.name = "Peppe";
        pig.animalSound();
    }

}
