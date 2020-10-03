package view;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import controller.Controller;
import processing.core.PApplet;
import processing.core.PImage;



public class Mainscreen extends PApplet {

	private  Controller controller;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main(Mainscreen.class.getName());
	}
	
	
	
	
	PImage back;
	PImage  floor;
	PImage  fireon;
	PImage  fireoff;
	PImage  ave;
	PImage  fondo;
	PImage  forest;
	PImage  kids;
	PImage  migajas;
	PImage  moon;
	PImage  skym;
	PImage  skyn;
	PImage  sun;
	
 	public void settings() {
		size(600,600);
	}
public void setup() {

	controller = new Controller(this); 
	
		read();
	
		// TODO Auto-generated catch block
	
	
	

}

public void draw(){
	
	controller.draw();
}
public void mousePressed() {
	controller.mouse();
}
public void keyPressed() {
	controller.key();
}

public void read() {
	

	String lista2 [] = null  ;
	String lista1 []; 

	lista1 = loadStrings("text/cuento.txt");


	for(int i =0; i < lista1.length; i++){


		
	
	lista2 = lista1[i].split(" ");
	
	if(lista2[i].equals("una")) {
	


}
	println(lista2[1]);
}
}}









