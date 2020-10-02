package model;
import processing.core.PImage;
import processing.core.PApplet;




public class Logic {
	private PApplet app;


public Logic(PApplet app) {
	this.app = app;
	
}
	PImage back;
	PImage  floor;
	PImage  fireon;
	PImage  fireoff;
	PImage  ave;
	PImage  fondo;
	PImage  forest;
	PImage  kids;
	PImage  migajas;
	PImage  moon;
	PImage  skym;
	PImage  skyn;
	PImage  sun;
	
	float breadx;
float bready;
SunMoon s;
Campfire fire;	
Brothers bro;
Bird p;


float x0,x1,x2;

 	public void settings() {
		app.size(600,600);
	}
public void setup() {
	
	x0=0;
	x1=0;
	x2=0;

  
s = new SunMoon(400,90,true);

p = new Bird(170,100,true);

fire = new Campfire(150,430,true) ;

bro = new Brothers(450,400,true);

	}

public void draw() {
	
	if(bro.getBread()) {
	bread(bro.posX,bro.posY,150,450);
	
	}
	
}
public void mousepressed() {
	
	
}

public void read() {
	
	
}
	
	

public void night() {
	
	
}
public void day() {
	if(s.getState()) {
		
	}else {
		
	}
	
}
public void fire() {
	
}

	
void bread(float ix,float iy,float fx,float fy) {
	
	if(ix < fx) {ix++;}else {ix--;}
	if(iy < fy) {iy++;}else {iy--;}
	
	app.image (migajas,ix, iy);

}

public void backMove() {
	if(x0<=50) {
	x0=(float) (x0*1.3);
	x1=(float) (x1*1.5);
	x2=(float) (x2*1.9);
	}
}

}
