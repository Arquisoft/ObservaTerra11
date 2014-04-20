

PShape sun;
PImage suntex;

void setup() {
  size(200, 200, P3D);
  
 // suntex = loadImage("earth.jpg");  
   
  noStroke();
  fill(255);
  sphereDetail(40);

  sun = loadShape("https://docs.google.com/viewer?a=v&pid=sites&srcid=ZGVmYXVsdGRvbWFpbnxtbmNtaWd1ZWxuYXZhcnJvfGd4OjI0MTgyYWNiN2ExMmIzZjE");
  //sun.setTexture(suntex);  
}

void draw() {
  pushMatrix();
  translate(width/2, height/2, -150);  
  
  pushMatrix();
  rotateY(PI * frameCount / 500);
  shape(sun);
  popMatrix();
  
  popMatrix();
}

