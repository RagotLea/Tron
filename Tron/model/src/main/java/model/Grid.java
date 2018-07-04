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
Wall wallee = new Wall();
private IDimension dimension;
ArrayList<ILightCycles> lightCycles;
LightCycles lightcycles;
Color color;
ITronModel tron;
ITronGraphicsBuilder builder;

public Grid () {
	this.setX(600);
	this.setY(600);
	this.createGrid();
	this.lightcycles = new LightCycles(x, y, color.MAGENTA );
	this.addLightCycles(lightcycles);
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
public void createGrid() {
	for (int i= 0; i<= 600; i++) {
		for (int j = 2; j <= 600; j++) {
			  this.setWall(wall.SPACE);
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
