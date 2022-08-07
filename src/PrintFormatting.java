public class PrintFormatting {
    public static void main(String[] args) {

        //s - string
        //d - decimal/ integers
        //f - float and double
        //c - char
        //b - boolean

        String name = "Bob";
        int age = 29;

        System.out.println("Hello " + name + "! Your age is "+ age);
        //The same output with printf
        System.out.printf("Hello %s! Your age is %d \n", name, age); //keep in mind order
        System.out.printf("Hello %s! Your age is %d. Nice to meet you %s \n", name, age, name);
        System.out.printf("Hello %1$s! Your age is %2$d. Nice to meet you %1$s \n", name, age);


        double height = 192.34523434d;
        System.out.printf("%s is %.2f cm tall", name, height);

    }

}
