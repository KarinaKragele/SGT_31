package oop.abstraction;

public class CallingFish {
    public static void main(String[] args) {
       //Can not do this Pet pet = new Pet("Black", "Bread","Water",2)

        Fish fish = new Fish("Black","Bread", "Water",4,2);
        fish.printPetInfo();
    }
}
