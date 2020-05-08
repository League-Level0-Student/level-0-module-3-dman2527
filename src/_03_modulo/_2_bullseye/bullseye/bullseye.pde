
void setup() {
 
  // set the size of your sketch
  size(500,500);

int x = 200;
 int y = 200;
 int r = 100;
  for (int i = 0; i < 5; i++) {
   if (r %2 == 0){
   fill(#080000);
   }
   if (r%2 == 1){
    fill(#FCFCFC);
   }
   ellipse(250,250,x,y);
   x = x - 50;
   y = y - 50;
    r = r - 1;
}
}
void draw() {
  
  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.

}
  
  //Use an if statement and modulo to alternate the color of your rings.
  
  
