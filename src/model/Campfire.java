package model;

public class Campfire extends Elements {
	
	public boolean state;

	public Campfire(float posX, float posY, boolean state) {
		super(posX, posY);
		// TODO Auto-generated constructor stub
		this.state= state;
	}
public boolean getState() {
	return state;
}

}
