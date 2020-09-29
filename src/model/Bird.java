package model;



public class Bird extends Elements {
	
	
public boolean state;


	public Bird(float posX, float posY,boolean state ) {
		super(posX, posY);
		// TODO Auto-generated constructor stub
	}
void moveBird(float x,float y){
	if (state==true) {
		if(posX==x&&posY==y) {
			state=false;
		}else {
		if(posX < x) {posX++;}else {posX--;}
		if(posY < y) {posY++;}else {posY--;}
		}
	}
	if (state==true){
		
	}
	
}public float getX() { if(state==true) {
		return posX;}else { return 50;}
	}
	public float getY() {if(state==true) {
		return posY;}else { return 70;}
	}
}
