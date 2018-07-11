package model;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Observable;
import model.IGrid;
import model.WallEnum;
import view.ITronGraphicsBuilder;

public class Grid extends Observable implements IGrid {
private int x ;
private int y ;
private WallEnum wall;
Wall wallee ;
private IDimension dimension;
ArrayList<ILightCycles> lightCycles;
LightCycles lightcycles1;
LightCycles lightcycles2;
Color color;
ITronModel tron;
ITronGraphicsBuilder builder;
Ground ground;

public Grid () {
	this.setX(600);
	this.setY(400);
	this.lightcycles1 = new LightCycles(10, 100, color.blue );
	this.lightcycles2 = new LightCycles(100, 10, color.red );
}

public void setX(int x) {
	this.x = x;
}
@Override
public int getX() {
	// TODO Auto-generated method stub
	return this.x;
}
public void setY(int y) {
	this.y = y;
}
@Override
public int getY() {
	// TODO Auto-generated method stub
	return this.y;
}

public WallEnum getWall() {
	return this.wall;
}

public void setWall(WallEnum wall) {
	this.wall = wall;
}

@Override
public WallEnum createGrid() {
	for (int i= 0; i<= 600; i++) {
		for (int j = 2; j <= 400; j++) {
			  if ((i== 0) || (i == 600 - 1)) {
				  System.out.println("ook1");
				  this.setWall(wall.WALL);
				  wallee = new Wall(color.white, i, j);
				  System.out.println("ook2");
			  }
			  if ((j == 0)||(j == 400 - 1)) {
				  this.setWall(wall.WALL);
				  wallee = new Wall(color.white, i, j); 
				  System.out.println("ook3");
			  }
			
			
			  if ((lightcycles1.getWidth() == i) && (lightcycles1.getHeight() == j)) {
				  this.setWall(wall.BLUE_WALL);
				  wallee = new Wall(color.blue,i,j);
				  System.out.println("ook4");
			  }
			  
			  if ((lightcycles2.getWidth() == i) && lightcycles2.getHeight() == j) {
				  this.setWall(wall.RED_WALL);
				  wallee = new Wall(color.red,i,j);
				  System.out.println("ook5");
			  }
			  this.setWall(wall.GROUND);
			  ground = new Ground();
			  System.out.println("ook6");
			  
		}
		
	}
	System.out.println(wall);
	return this.getWall();
	
}



@Override
public void update(Observable arg0, Object arg1) {
	// TODO Auto-generated method stub
	
}

@Override
public IDimension getDimension() {
	// TODO Auto-generated method stub
	return this.dimension;
}

@Override
public ArrayList<ILightCycles> getLightCycles() {
	return this.lightCycles;
}

@Override
public ILightCycles getMobileByPlayer(int player) {
	for (final ILightCycles lightCycles : this.lightCycles) {
		if (lightCycles.isPlayer(player)) {
			return lightCycles;
		}
	}
	return null;
}

@Override
public void setMobilesHavesMoved() {
	this.setChanged();
	this.notifyObservers();
	
}

@Override
public void addLightCycles(ILightCycles lightCycles) {
	this.lightCycles.add(lightCycles);
	//lightCycles.setTronModel(lightCycles);
	
}

@Override
public ArrayList<ILightCycles> getCopyOfLightCycles() {
	final ArrayList<ILightCycles> copyOflightcycles = new ArrayList<ILightCycles>();

	for (final ILightCycles lightcycles : this.getLightCycles()) {
		copyOflightcycles.add(lightcycles);
	}
	return copyOflightcycles;
}

}
