//Declaring the object
Ball[] ballGroup;
int pos = 0;

void setup() {
    size(1400,700);
    //Creates the array
    ballGroup = new Ball[100];
}

void draw() {
    background(70,30,50);

    for (int i = 0; i < pos; i++) {
        ballGroup[i].display();
        ballGroup[i].move();
    }
    
}

void mousePressed() {
    //Creates a new object at this array position
    if (pos < ballGroup.length) {
        ballGroup[pos] = new Ball(mouseX, mouseY, 100);
        pos++;
    }
}