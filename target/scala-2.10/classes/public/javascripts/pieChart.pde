
int diameter = 175;

ArrayList<int[]> colors;

float angs[]=new float[values.length()];

void setup() {
  size(400, 400);
  background(255,0,0,0);
  smooth();
  noStroke();
  toAngs();

  colors=new ArrayList<int[]>();
  loadColors();
}

void draw() {
  float y=height/3-15/1.5;
  float ty=height/3;

  float lastAng = 0;
  for (int i=0; i<angs.length; i++) {
    fill(colors.get(i)[0], colors.get(i)[1], colors.get(i)[2]);
    arc(width/3, height/2, diameter, diameter, lastAng, lastAng+radians(angs[i]));
    lastAng += radians(angs[i]);
    rect(width/3+diameter/1.5, y, 15, 15);
    fill(0);
    text(values[i].country.code+"("+values[i].country.name+"): "+values[i].obsValue.toFixed(2), width/3+diameter/1.5+18, ty);
    y+=20;
    ty+=20;
  }
}

void toAngs() {
  int total=0;
  for (int i=0;i<values.length();i++)
    total+=values[i].obsValue;

  for (int i=0;i<angs.length;i++)
    angs[i]=values[i].obsValue*360/total;
}

void loadColors() {
  int[] rgb;
  int r;
  int g;
  int b;
  ArrayList<Integer> red=new ArrayList<Integer>();
  ArrayList<Integer> green=new ArrayList<Integer>();
  ArrayList<Integer> blue=new ArrayList<Integer>();
  for (int i=0;i<values.length();i++) {
    rgb=new int[3];
    do {
      r= (int)(Math.random()*255);
      rgb[0]=r;
      g= (int)(Math.random()*255);
      rgb[1]=g;
      b= (int)(Math.random()*255);
      rgb[2]=b;
    }
    while (colors.contains (rgb));

    colors.add(rgb);
  }
}


