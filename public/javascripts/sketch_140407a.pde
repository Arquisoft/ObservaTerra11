Bar[] bars;

void setup() {
  size(400, 400);
  bars=createBars();
}

void draw() {
  background(255,0,0,0);
  fill(0, 100, 255);
  for (Bar bar:bars)
    bar.display();
}

Bar[] createBars() {
  float x=50;
  float h;//altura de la barra
  Bar[] bars=new Bar[values.length()];//usa el attr. values del index.html
  float maxValue=getMaxValue();
  for (int i=0;i<values.length();i++) {
    h=escalar(values[i].obsValue, maxValue);
    bars[i]=new Bar(values[i].country.code, values[i].country.name, 
    values[i].obsValue.toFixed(2), x, 300, 25, h);
    x+=45;
  }
  return bars;
}

//función para escalar los obsValue y que no sobrepasen los 250px
float escalar(float n, Float maxValue) {
  float div=getDivisor(maxValue);
  double result = 250 * n / div;
  return (float)result;
}

//retorna el nº por el que se van a dividir los obsValue
float getDivisor(Float n) {
  int integerDigits=((Integer)Math.round(n)).toString().length();
  if (n>1) {
    return (float)(n + Math.pow(3, integerDigits - 1));
  }
  else
    return n + 0.1;
}

//retorna el mayor de los obsValue
float getMaxValue() {
 float max=0;
 for (int i=0;i<values.length();i++)
   if (values[i].obsValue>max)
      max=values[i].obsValue;
  return max;
}

//clase que modela las barras del gráfico de barras
public class Bar {

  float width, height;
  float barX, barY;
  String code, name;
  float value;
  
  float c=0;//contador para el crecimiento de la barra
  float speedY=1.75;//pixels de height a incrementar en cada frame si procede
  
  boolean rectOver = false;//indica si el cursor está sobre la barra

  Bar(String code, String name, float value, float x, float y, float w, float h) {
    this.code=code;
    this.name=name;
    this.value=value;
    this.barX=x;
    this.barY=y;
    this.width=w;
    this.height=h;
  }

  void display() {
  	update(mouseX, mouseY);
    if (rectOver)
    	fill(100, 100, 255, 160);
	else
    	fill(100, 100, 255, 255); 
    rect(this.barX, this.barY, this.width, -getHeight());
    fill(0);
    if(this.c>=this.height){ //si counter ya llegó al tope...
    	textSize(12); //procedemos a escribir el obsValue
    	text(this.value, this.barX, this.barY-this.height-5); 
  		text(this.code, this.barX, this.barY+15); 
  	}
  }
  
  float getHeight(){
  	float value=0.0;
  	if(c<this.height){ //si contador no llegó al tope...
  		value=this.c;
  		this.c+=this.speedY; //incrementa
 	} else
  		value=this.height;
 	return value;
  }

  void update(int x, int y) {
    if (overRect(this.barX, this.barY, this.width, this.height)) 
      rectOver = true;
    else
      rectOver = false;
  }

  //comprueba si cursor está sobre la barra
  boolean overRect(float x, float y, int width, int height) {
    if (mouseX >= x && mouseX <= x+this.width 
    && mouseY >= y-this.height && mouseY <= y) {
      return true;
    } 
    else {
      return false;
    }
  }
}


