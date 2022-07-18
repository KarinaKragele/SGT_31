public class Switch {
    public static void main(String[] args) {

        int month = 2;

        if(month == 1){
            System.out.println("In January there are 31");
        } else if (month == 2){
            System.out.println("In February there are 28");
        }else if (month == 3) {
            System.out.println("In March there is 31");
        } else if (month == 4) {
            System.out.println("In April there is 30");
        } else if (month == 5) {
            System.out.println("In May there is 31");
        } else if (month == 6) {
            System.out.println("In June there is 30");
        } else if (month == 7) {
            System.out.println("In July there is 31");
        } else if (month == 8) {
            System.out.println("In August there is 31");
        } else if (month == 9) {
            System.out.println("In September there is 30");
        } else if (month == 10) {
            System.out.println("In October there is 31");
        } else if (month == 11) {
            System.out.println("In November there is 30");
        } else if (month == 12) {
            System.out.println("In December there is 31");
        } else {
            System.out.println("Please enter number between 1 - 12");
        }

        //Same but using Switch statement
        switch (month){
            case 1:
                System.out.println("In January there are 31");
                break;
            case 2:
                System.out.println("In February there are 28");
                break;
            default:
                System.out.println("Please enter number between 1 - 12");
        }
    }
}
