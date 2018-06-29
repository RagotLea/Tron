package model;
import java.util.Observable;

import model.IGrid;
import model.WallEnum;

public class Grid implements IGrid {
private int x = 600;
private int y = 400;
private WallEnum wall;
Wall wallee = new Wall();
private IDimension dimension;

public Grid () {
	this.createGrid();
}

@Override
public int getX() {
	// TODO Auto-generated method stub
	return this.x;
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



}
