public class App {
    public static void main(String[] args) throws Exception {
        Module process = new Module();

        process.set(50);
        process.calc();

        // When you call process without a method, it will default to the toString method
        // you have defiend in the module.
        System.out.println("REUSLT:  " + process);
    }
}
