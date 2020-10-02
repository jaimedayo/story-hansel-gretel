package model;

public class Brothers extends Elements{

	private boolean state;
	public Brothers(float posX, float posY, boolean state) {
		super(posX, posY);
		// TODO Auto-generated constructor stub
		this.state=state;
	}

public boolean getBread() {
	return state;
}
public void setBreadOn() {
	state=true;
}
public void setBreadOff() {
	state=false;
}
}
