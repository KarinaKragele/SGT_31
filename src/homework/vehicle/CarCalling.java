package homework.vehicle;

import java.util.Scanner;

public class CarCalling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter fuel amount in your vehicle");
        float fuel = scanner.nextFloat();

        System.out.println("Enter your vehicle's fuel usage per 100 km");
        float fuelUsage = scanner.nextFloat();

        System.out.println("Enter how many passengers will be in the vehicle");
        int passengers = scanner.nextInt();

        //scanner.nextBoolean()

        System.out.println("Will you turn on air conditioner? y/n");
        char input = scanner.next().charAt(0);
        boolean airConditioner = false; //local ...

        if(input == 'y'){
            airConditioner = true;
        }

        Car car = new Car(fuel,fuelUsage,passengers,airConditioner);
        System.out.printf("Your vehicle can drive maximum of %.2f kilometers",car.maxDistance());

    }
}
