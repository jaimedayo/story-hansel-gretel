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

p = new Bird(470,100,true);

fire = new Campfire(150,430,true) ;

bro = new Brothers(450,400,true);

	}

public void draw() {
	
	hour();
	
	back();
	
	kid();
	
	fire();
	
	
	
	flyG(150,450,170,100);
	
	
	
}
public void mousepressed() {
	
	//sun controller
if(app.mouseX>=100&&app.mouseX<=200  &&  app.mouseY>=100&&app.mouseY<=200 ) {
		
	day();
	}
	

	//fire controller
if(app.mouseX>=100&&app.mouseX<=200  &&  app.mouseY>=100&&app.mouseY<=200 ) {
	
	controlFire();
	}


//brothers controller
if(app.mouseX>=100&&app.mouseX<=200  &&  app.mouseY>=100&&app.mouseY<=200 ) {
	
	if(bro.getBread()==false) {
	bro.setBreadOn();
	}
}


//bird go up controller
if(app.mouseX>=p.posX&&app.mouseX<=(p.posX+70)  &&  app.mouseY>=p.posY&&app.mouseY<=(p.posY+70) ) {
	
	bro.setBreadOff();
	p.setflyB();
}


//bird go down controller
if(app.mouseX>=100&&app.mouseX<=200  &&  app.mouseY>=100&&app.mouseY<=200 ) {
	
	if(bro.getBread()) {
		p.setflyG();
	}
	
}

	
}
public void keyPressed() {
	if(app.keyCode==app.RIGHT) {
	backMove();
	}}

public void read() {
	
	
}
	

public void kid() {
	
	app.image(kids,bro.posX,bro.posY);
	if(bro.getBread()) {
		
	bread(bro.posX,bro.posY,150,450);
	}
	}


public void flyG(float x,float y,float x1,float y1){
	
	if (p.state) {
		
		if(p.posX < x) {p.posX ++;}else {p.posX --;}
		if(p.posY < y) {p.posY ++;}else {p.posY --;}
		
		app.image (ave,p.posX,p.posY);
		}else{
			if(p.posX < x1) {p.posX ++;}else {p.posX --;}
			if(p.posY < y1) {p.posY ++;}else {p.posY --;}
			
			app.image (ave,p.posX,p.posY);
			
		
		}
		}

public void hour() {
	if(s.state) {
		app.image(skym, 0, 0);
		app.image(sun, s.posX, s.posY);
	}else {
		app.image(skyn, 0, 0);
		app.image(moon, s.posX, s.posY);
	}
	
}
public void day() {
	if(s.getState()) {
		s.setDay();
	}else {
		s.setNight();
	}
	
}



public void fire() {
	if(fire.state) {
	app.image (fireon,fire.posX,fire.posY);
		}else{
	app.image (fireoff,fire.posX,fire.posY);
			}
}
	public void controlFire() {
		if(fire.getState()) {
			fire.setFireOn();
		}else {
			fire.setFireOff();
		}
	
}

	
public void bread(float ix,float iy,float fx,float fy) {
	
	if(ix < fx) {ix++;}else {ix--;}
	if(iy < fy) {iy++;}else {iy--;}
	
	app.image (migajas,ix, iy);

}

public void backMove() {
	
	if(x0<=50) {
	x0=(float) (x0*1.3);
	x1=(float) (x1*1.5);
	x2=(float) (x2*1.9);
	}}
	public void back() {

		app.image(back, x0, 100);
		app.image(floor,x1,200);
		app.image (forest,x2,0);
	}
	
}


