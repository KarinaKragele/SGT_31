package oop;

public class Animal {

    //Fields
    private String type;
    private String breed;
    private float weight;
    private int avgLifespan;

    //Custom constructor without checks. We do not use void key word, it does not return anything
    //To skip 4 setter methods we use constr.
    public Animal (String type, String breed, float weight, int avgLifespan){
        this.type = type;
        this.breed = breed;
        this.weight = weight;
        this.avgLifespan = avgLifespan;
    }

    public Animal(String type, String breed, float weight){
        this.type = type;
        this.breed = breed;
        this.weight = weight;
    }
    public Animal(){

    }
    public void setAvgLifespan (int avgLifespan){
        this.avgLifespan = avgLifespan;
    }
    public void printAnimalInfo(){
        System.out.println("Type: " +  type);
        System.out.println("Breed: " + breed);
        System.out.println("Weight: "+ weight + " kg");
        System.out.println("Average lifespan: " + avgLifespan + " years");
    }

}
