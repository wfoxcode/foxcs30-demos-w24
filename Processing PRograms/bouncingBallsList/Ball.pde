class Ball {
    int x, y, r; //Declare position and radius variables
    int cr, cg, cb; //RGB values
    int dx, dy; //Velocity or Speed Values
    int width, height; //variables for the screen dimensions

    // Constructor Method
    Ball(int ballx, int bally, int ballr, int windoww, int windowh) {
        x = ballx; //set the x cord
        y = bally; //set the y cord
        r = ballr; //set the radius

        //Randomize colour values
        cr = int( random(0,255) );
        cg = int( random(0,255) );
        cb = int( random(0,255) );

        //Set Velocity
        dx = int( random(-10,10));
        dy = int( random(-10,10));

        // Passing over the width and height data of the screen
        width = windoww; 
        height = windowh;
    }

    void display() {
        fill(cr, cg, cb);
        circle(x,y,r);
    }

    void move() {
        //apply the rate of change (velocity)
        x = x + dx;
        y = y + dy;

        if (x <= 0) {
            // Reverses direction
            dx = dx * -1;
        }

        if (y <= 0) {
            //Reverse direction
            dy = dy * -1;
        }

    }
}