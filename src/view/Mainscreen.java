package view;
import controller.Controller;
import processing.core.PApplet;
import processing.core.PImage;



public class Mainscreen extends PApplet {

	private  Controller controller;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main(Mainscreen.class.getName());
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
	
 	public void settings() {
		size(600,600);
	}
public void setup() {

	controller = new Controller(this); 
	
	back = loadImage("img/back.png");
	floor = loadImage("img/floor.png");
	ave = loadImage("img/ave.png");
	fireon = loadImage("img/fireOn.png");
	fireoff = loadImage("img/fireOff.png");
	fondo = loadImage("img/fondo 1.png");
	forest = loadImage("img/forest.png");
	kids = loadImage("img/kids.png");
	migajas = loadImage("img/migaja.png");
	moon = loadImage("img/moon.png");
	skyn = loadImage("img/skyn.png");
	skym = loadImage("img/skym.png");
	sun = loadImage("img/sun.png");

}

public void draw(){
	
	
	controller.draw();
	
	}
}