package model;


public class SunMoon extends Elements {
public boolean state;	

	public SunMoon(float posX, float posY, boolean state) {
		super(posX, posY);
		// TODO Auto-generated constructor stub
		this.state= state;
	}
public boolean getState() {
	return state;
}
}
