package homework.maxdistance;

import java.util.Vector;

public class Vehicle {
    protected Float fuel; //For optional additional task changed from private to protected
    protected Float fuelUsage; //For optional additional task changed from private to protected
    protected static int passengers; //For optional additional task changed from private to protected

    public Vehicle(){
        fuel = 70.0f;
        fuelUsage = 7.0f;
        passengers = 0;
    }
    public static void main(String[] args) {
        Vehicle maxDistance = new Vehicle();
       if (passengers == 0) {
            System.out.printf("%.2f",maxDistance.fuel / maxDistance.fuelUsage *100);
        } else{
            System.out.printf("%.2f",maxDistance.fuel / (maxDistance.fuelUsage + maxDistance.fuelUsage * passengers*0.05) * 100);
        }
    }
}
