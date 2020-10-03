package model;
import processing.core.PImage;
import processing.core.PApplet;



public class Logic {
	private PApplet app;
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
boolean mb;

public Logic(PApplet app) {
	this.app = app;

	back = app.loadImage("img/back.png");
	floor = app.loadImage("img/floor.png");
	ave = app.loadImage("img/ave.png");
	fireon = app.loadImage("img/fireOn.png");
	fireoff = app.loadImage("img/fireOff.png");
	fondo = app.loadImage("img/fondo 1.png");
	forest = app.loadImage("img/forest.png");
	kids = app.loadImage("img/kids.png");
	migajas = app.loadImage("img/migaja.png");
	moon = app.loadImage("img/moon.png");
	skyn = app.loadImage("img/skyn.png");
	skym = app.loadImage("img/skym.png");
	sun = app.loadImage("img/sun.png");
	setup();
}
	
	
	float breadx;
float bready;
SunMoon s;
Campfire fire;	
Brothers bro;
Bird p;

float x0,x1,x2;

 
public void setup() {
	
	x0=0;
	x1=0;
	x2=0;
mb=true;
  
s = new SunMoon(400,90,false);

p = new Bird(300,90,false);

fire = new Campfire(200,430,false) ;

bro = new Brothers(350,400,false);

	}

public void draw() {
	
	
	hour();
	back();
	
	kid();
	
	fire();
	
	
	
	flyG(150,450,100,90);
	
	
	if(mb) {
		app.textSize(16);
		app.text("you can move the back grond with the kay-right and key-left", 80,50);
	}
	
}

public void mousepressed() {
	
	//sun controller
if(app.mouseX>=s.posX&&app.mouseX<=(s.posX+133)  &&  app.mouseY>=s.posY&&app.mouseY<=(s.posY+233) ) {
	if(s.state) {s.setNight();}	else {s.setDay();}
	}
	

	//fire controller
if(app.mouseX>=fire.posX&app.mouseX<=(fire.posX+102)  &&  app.mouseY>=fire.posY&&app.mouseY<=fire.posY+81 ) {
	
	if(fire.state) {fire.setFireOff();}else {fire.setFireOn();}
	}


//brothers controller
if(app.mouseX>=bro.posX&app.mouseX<=(bro.posX+185) &&  app.mouseY>=bro.posY&&app.mouseY<=(bro.posY+165)) {
	
	if(bro.getBread()==false) {
	bro.setBreadOn();
	}
}


//bird go up controller
if(app.mouseX>=p.posX&&app.mouseX<=(p.posX+100)  &&  app.mouseY>=p.posY&&app.mouseY<=(p.posY+100) ) {
	
	bro.setBreadOff();
	p.setflyB();
}


//bird go down controller
if(app.mouseX>=150&&app.mouseX<=180  &&  app.mouseY>=450&&app.mouseY<=480 ) {
	
	if(bro.getBread()) {
		p.setflyG();
	}
	
}

	
}
public void keyPressed() {
	if(app.keyCode==app.RIGHT&&x0>=(-50)) {	backMove(); }

	if(app.keyCode==app.LEFT&&x0<=(0)) {	backMove1(); }
	mb=false;
	}

public void read() {
	
	
		

}


public void kid() {
	
	app.image(kids,bro.getx(),bro.gety());
	
		
	bread(bro.posX,(bro.posY+90),150,450);
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


public void fire() {
	if(fire.state) {
	app.image (fireon,fire.posX,fire.posY);
		}else{
	app.image (fireoff,fire.posX,fire.posY);
			}
}


public void bread(float ix,float iy,float fx,float fy) {
	if(bro.getBread()) {
	app.image (migajas,fx, fy);
	}else {
	app.image (migajas,ix, iy);
	}

}

public void backMove() {
	
	if(x0<=50) {
	x0=x0-1;
	x1=x1-8;
	x2=x2-15;
	}
	}
public void backMove1() {
	
	if(x0<0) {
	x0=x0+1;
	x1=x1+8;
	x2=x2+15;
	}
	}

	public void back() {

		app.image(back, x0, 200);
		app.image(floor,x2,200);
		app.image (forest,x1,200);
	}
	
}


