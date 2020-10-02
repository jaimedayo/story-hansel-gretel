package controller;

import model.Logic;
import view.Mainscreen;

public class Controller {
	private Logic logic;
	private Mainscreen mainscreen;

	
	
	
public void start() {
	mainscreen= new Mainscreen();
	
	logic = new Logic(mainscreen);
	
	}
}
