import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner keys = new Scanner(System.in);

        // System.out.println("Enter an integer: ");
        // int int1 = keys.nextInt();

        // System.out.println("Enter another integer: ");
        // int int2 = keys.nextInt();

        // System.out.println("Enter a decimal number: ");
        // double dbl1 = keys.nextDouble();

        // System.out.println("Enter a second decimal number: ");
        // double dbl2 = keys.nextDouble();

        for (int i = 0; i < 10; i++) {
            System.out.println("The number is: " + rdInt(100) );
        }
    }

    // Custom Random Double Generator
    public static double rdDbl(double max) {
        //generate random double between 0 and max
        double gen = Math.random() * max;

        return gen;
    }

    public static int rdInt(int max) {
        //generate random double between 0 and max
        double gen = Math.random() * max;

        //Cast the double as an int to drop the decimals
        return (int) gen;
    }
}
