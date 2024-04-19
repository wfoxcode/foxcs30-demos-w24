import java.util.Scanner;

public class Module {
    private Scanner keys = new Scanner(System.in);    

    // Void or no return
    public void myName() {
        String name = keys.nextLine();

        System.out.print("Their name is " + name);

    }

    // int type return, includes return statement
    public int myAge() {
        System.out.println("Enter your age: ");
        int age = keys.nextInt();

        return age;
    }

}
