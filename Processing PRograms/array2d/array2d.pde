grid g; //declare

void setup() {
  size (1650,800);
  g = new grid(10,10); //initialize
}

void draw() {
  background(220);
  g.displayGrid();
}

void mousePressed() {
  g.click(mouseX,mouseY);
}

class grid {
  Boolean[][] gridarray;
  int ROWS, COLS;
  
  grid(int r, int c) {
    ROWS = r;
    COLS = c;
    gridarray = new Boolean[ROWS][COLS];
    
    //Initialize the array with all false values
    for (int y = 0; y < ROWS; y++) {    //loop rows
      for (int x = 0; x < COLS; x++) { //loop cols
        gridarray[y][x] = false;
      }
    } 
  }
  
  void displayGrid() {
    for (int y = 0; y < ROWS; y++) {
      for (int x = 0; x < COLS; x++) {
        if (gridarray[y][x] == false) {
          fill(255);  //255 is white
        }
        else if (gridarray[y][x] == true) {
          fill(0);    //0 is black
        }
        int cellWidth = width / COLS;
        int cellHeight = height / ROWS;
        rect(x * cellWidth, y * cellHeight, cellWidth, cellHeight); // param: x, y, width, height
      }
    }
  }
  
  void click(int mx, int my) {
    int cellWidth = width / COLS;
    int cellHeight = height / ROWS;
    int x = mx / cellWidth;
    int y = my / cellHeight;
    
    if (gridarray[y][x] == false) {
      gridarray[y][x] = true;
    }
    else {
      gridarray[y][x] = false;
    }
  }
}
