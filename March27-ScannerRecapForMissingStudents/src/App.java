import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner keys = new Scanner(System.in);
        String name;
        int intnum;
        double dblnum;

        System.out.println("Hello, World! What is your age? ");
        intnum = keys.nextInt();
        System.out.println("You said " + intnum + "\nenter a word");
        keys.nextLine(); //clear the input stream
        
        name = keys.nextLine();
        System.out.println("You said " + name);

    }
}
