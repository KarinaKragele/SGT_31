package homework.maxdistance;

class Car extends Vehicle {

   private boolean airConditioner;

    boolean isAirConditioner = true;

    public static void main(String[] args) {
        Car maxDistance = new Car();

        if (maxDistance.airConditioner = true) {
            if (passengers == 0) {
                System.out.printf("%.2f", maxDistance.fuel / (maxDistance.fuelUsage + (maxDistance.fuelUsage * 0.1)) * 100);
            } else {
                System.out.printf("%.2f", maxDistance.fuel / ((maxDistance.fuelUsage + maxDistance.fuelUsage * passengers * 0.05) * 1.1) * 100);
            }
        }else {
            if (passengers == 0) {
                System.out.printf("%.2f", maxDistance.fuel / maxDistance.fuelUsage * 100);
            } else {
                System.out.printf("%.2f", maxDistance.fuel / (maxDistance.fuelUsage + maxDistance.fuelUsage * passengers * 0.05) * 100);
            }
        }
    }
}
