package model;
import processing.core.PImage;
import processing.core.PApplet;




public class Logic {
	private PApplet app;

public Logic(PApplet app) {
	this.app = app;
}
private PImage im;
public Logic(PImage im) {
	this.im = im;
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
	
SunMoon s;
Campfire fire;	
Brothers bro;
Bird p;

 	public void settings() {
		app.size(600,600);
	}
public void setup() {
	
	

  
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
public void fire() {
	
}

	
void bread(float ix,float iy,float fx,float fy) {
	
	image (migajas,ix,ix);
}

private void image(PImage migajas2, float ix, float ix2) {
	// TODO Auto-generated method stub
	
}


public void backMove(float x0,float x1,float x2) {
	
	
}

}
