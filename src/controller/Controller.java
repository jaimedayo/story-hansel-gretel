package controller;

import model.Logic;
import processing.core.PApplet;
import view.Mainscreen;




public class Controller {
		
	 PApplet app;
	public Controller( PApplet app) {
	
	
	this.app = app;
	}
	private Logic logic;
	private Mainscreen mainscreen;

	
	
	
public void start() {
	mainscreen= new Mainscreen();
	
	logic = new Logic(app);
	
	
	
	}
public void draw() {
	
	logic.draw();
	
	
	
}
public void mouse() {
	logic.mousepressed();
	
}
public void key() {
	logic.keyPressed();
	
}
}
