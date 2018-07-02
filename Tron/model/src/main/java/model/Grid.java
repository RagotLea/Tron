package model;
import java.util.ArrayList;
import java.util.Observable;

import model.IGrid;
import model.WallEnum;

public class Grid extends Observable implements IGrid {
private int x ;
private int y ;
private WallEnum wall;
Wall wallee = new Wall();
private IDimension dimension;
ArrayList<ILightCycles> lightCycles;
ITronModel tron;

public Grid () {
	this.setX(600);
	this.setY(600);
	this.createGrid();
}

public void setX(int x) {
	this.x = x;
}
@Override
public int getX() {
	System.out.println(this.x);
	// TODO Auto-generated method stub
	return this.x;
}
public void setY(int y) {
	this.y = y;
}
@Override
public int getY() {
	System.out.println(this.y);
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
public void createGrid() {
	for (int i= 0; i<= this.getX(); i++) {
		for (int j = 2; j <= this.getY(); j++) {
			wallee.createSpace();
		}
	}
	
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
	lightCycles.setTronModel(tron);
	
}

@Override
public ILightCycles getCopyOfLightCycles() {
	// TODO Auto-generated method stub
	return null;
}

}
