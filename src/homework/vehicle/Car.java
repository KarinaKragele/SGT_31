package homework.vehicle;

public class Car extends Vehicle {

    boolean airConditioner;
    public Car(float fuel, float fuelUsage, int passengers, boolean airConditioner){ //custom constructor look like when we cll
        super(fuel,fuelUsage,passengers);
        this.airConditioner = airConditioner;
    }
    public float maxDistance() {
        //add.local variable that will help to determine if need to increase usage. If boolean is true/false
        float airConditionerAdd;
        if (airConditioner) {
            airConditionerAdd = 1.1f;
        } else {
            airConditionerAdd = 1f;
        }
        float usage = fuelUsage * (1 + passengers * 0.05f);
        float maxDistance = fuel / (usage * airConditionerAdd) * 100;
        return maxDistance;

    }

}

