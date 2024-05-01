import java.util.Scanner;

public class App {
    public void main(String[] args) throws Exception {
        
        // LOOP OVERVIEW - identical while and for loops
        int x = 3;
        while (x > 0) {
            System.out.println(x);
            x = x - 1;
        }

        // for (variable starting value; ending condition; increment/step/change)

        for (int i = 3; i > 0; i--) {
            System.out.println(i);
        }

//        ----------------------------------
//              GAME LOOP CONCEPT
//        ----------------------------------
 //Three requitements
 // 1) boolean trigger variable
 // 2) while loop
 // 3) play again conditional
    
        // Trigger Variable
        boolean playagain = true;
        Scanner keys = new Scanner(System.in);

        // Game loop, using the trigger for a condition
        while(playagain) {

            //This is my entire game ----
            System.out.println("This is my program, it would be bigger in a real project");
            myGame();
            //This is my entire game ----


        //Play again conditional
            System.out.println("Do you want to play again? (1 = yes, 0 = no): ");
            int inp = keys.nextInt();

            //If they selected no, trigger the game variable
            if (inp == 0) {
                playagain = false;
            }

        }



    }
}



private static void myGame() {

}
