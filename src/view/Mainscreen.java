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
	
	back = loadImage("img/back.png");
	floor = loadImage("img/floor.png");
	ave = loadImage("img/ave.png");
	fireon = loadImage("img/fireOn.png");
	fireoff = loadImage("img/fireOff.png");
	fondo = loadImage("img/fondo 1.png");
	forest = loadImage("img/forest.png");
	kids = loadImage("img/kids.png");
	migajas = loadImage("img/migaja.png");
	moon = loadImage("img/moon.png");
	skyn = loadImage("img/skyn.png");
	skym = loadImage("img/skym.png");
	sun = loadImage("img/sun.png");
	try {
		read();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}



public void draw(){
}

public void read() throws IOException {
	
	
	List<String> lista =new ArrayList<>();
	try(FileReader	fr	= new FileReader("text/cuento.txt");
	BufferedReader br=new BufferedReader(fr)){
String linea;

while((linea = br.readLine()) != null) {
lista.add(linea);
}

System.out.println("Cantidad de registros: " + lista.size());

String [] arreglo = new String[lista.size()]; // Copiar el contenido de la lista a un arreglo de Strings, esto es opcional pero seguramente es una tarea escolar
for(int i = 0; i < lista.size(); i++)
{
arreglo[i] = lista.get(i);

}

System.out.println(Arrays.toString(arreglo));
} 
catch (FileNotFoundException e)
{
e.printStackTrace();
} 
catch (IOException e)
{
e.printStackTrace();
}

}


}