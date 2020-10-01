package model;



public class Bird extends Elements {
	
	
public boolean state;


	public Bird(float posX, float posY,boolean state ) {
		super(posX, posY);
		// TODO Auto-generated constructor stub
	}
void flyG(float x,float y){
	
	if(posX==x&&posY==y) {state=false;}
	
	if (state==true) {
		}else {
		if(posX < x) {posX++;}else {posX--;}
		if(posY < y) {posY++;}else {posY--;}
		
	}
}
	void flyB(float x,float y){
		
		if(posX==x&&posY==y) {state=true;}
		
		if (state==false) {
			if(posX < x) {posX++;}else {posX--;}
			if(posY < y) {posY++;}else {posY--;}
			}
		
		
}
public float getX() {
		return posX;
}
	public float getY() {
		return posY;
		}
	
}
