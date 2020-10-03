package controller;

import model.Logic;
import processing.core.PApplet;
import view.Mainscreen;




public class Controller {
			private Logic logic;
	private Mainscreen mainscreen;

	
	
	 PApplet app;
	public Controller( PApplet app) {
	
	logic = new Logic(app);
	this.app = app;
	}

	
public void start() {
	mainscreen= new Mainscreen();
	
	
	
	
	
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
