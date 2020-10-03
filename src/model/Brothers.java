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
public float getx() {
	return posX;
}
public float gety() {
	return posY;
}
public void setBreadOn() {
	state=true;
}
public void setBreadOff() {
	state=false;
}
}
