import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter speed in mp/h");
        float speed = scanner.nextFloat();
        System.out.println(speed + " mp/h in km/h would be equal to " + (1.6f * speed) + " km/h");
    }
}
