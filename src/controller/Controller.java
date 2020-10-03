package controller;


//import the package
import model.Logic;
import processing.core.PApplet;





public class Controller {
			private Logic logic;


	
	//the object logic is being initialized
	 PApplet app;
	public Controller( PApplet app) {
	
	logic = new Logic(app);
	this.app = app;
	}

	

//the methods of logic are prepared to be send to Mainscreen
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
