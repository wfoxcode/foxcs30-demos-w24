public class App {
    public static void main(String[] args) throws Exception {
        
        
        double x = 0;

        x = Math.random(); 
        // A number between 0.0 and 1.0 non-inclusive
        // 0 < x < 1    OR interval notation    x element of (0,1) 

        //System.out.println("The number is \n" + x);

        x = Math.random() * 100;
        // Multiply the max and min of the interval
        // 0 < x < 1    becomes    0*100 < x < 1*100 --->  a number in 0 < x < 100
        System.out.println("The number is \n" + x);

        x = Math.random() * 50 + 25;
        // Multiple first, then add to the interval max/min
        // 0*50+25 < x < 1*50 + 25    ---> a number in 25 < x < 75
        // A number between 25 and 75

    }
}
