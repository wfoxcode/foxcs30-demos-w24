//Global Declarations
Walker joe;

void setup() {
  size(1500,700);
  joe = new Walker(0,0);
  
}

void draw() {
  background(255,255,255);
  joe.display();
}

void mousePressed() {
  
}

void keyPressed() {
  // For arrows use keyCode and UP, DOWN, ENTER, etc...
  // For ACSII characters, do key and 'a', 'w', etc...
  
  if (keyCode == UP) {
    joe.move(0);
  }
  else if (keyCode == RIGHT) {
    joe.move(1);
  }
  else if (keyCode == DOWN) {
    joe.move(2);
  }
  else if (keyCode == LEFT) {
    joe.move(3);
  }
}
