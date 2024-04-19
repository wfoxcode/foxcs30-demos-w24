public class App {
    public static void main(String[] args) throws Exception {
        Module lib = new Module();

        lib.myName();
        
        // The return method is as good as the data it returns
        // E,g, myAge() can be treated similar to the number 5
        int playerage = lib.myAge(); 
        System.out.println("My age is " + playerage );
    }
}
