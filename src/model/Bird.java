package model;



public class Bird extends Elements {
	
	
public boolean state;


	public Bird(float posX, float posY,boolean state ) {
		super(posX, posY);
		// TODO Auto-generated constructor stub
	}
void setflyG(){
	state=true;
}
	void setflyB(){
		state=false;
}
public float getX() {
		return posX;
}
	public float getY() {
		return posY;
		}
	
}
