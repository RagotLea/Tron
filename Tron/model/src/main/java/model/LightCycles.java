package model;

import java.awt.Color;

public class LightCycles extends Grid implements ILightCycles {
private int width;
private int height;
private Direction direction;
private Color color;
private ITronModel tronModel;
private IPosition position;

public LightCycles(int width, int height, Color color) {
	this.setWidth(width);
	this.setHeight(height);
	this.setColor(color);
}


@Override
public void move() {
	switch (direction) {
	case UP:
		this.moveUp();
	case DOWN:
		this.moveDown();
	case RIGHT:
		this.moveRight();
	case LEFT: 
		this.moveLeft();
	}
}


public void moveUp() {
	this.setHeight(getHeight()+1);
}

public void moveDown() {
	this.setHeight(getHeight()-1);
}

public void moveRight() {
	this.setWidth(getWidth()+1);
}

public void moveLeft() {
	this.setWidth(getWidth()-1);
}

@Override
public int getWidth() {
	return this.width;
	// TODO Auto-generated method stub
	
}

@Override
public int getHeight() {
	return this.height;
	// TODO Auto-generated method stub
	
}

@Override
public void setWidth(int width) {
	this.width = width;
	
}

@Override
public void setHeight(int height) {
	this.height = height;
	
}

@Override
public Direction getDirection() {
	// TODO Auto-generated method stub
	return this.direction;
}


@Override
public Color getColor() {
	// TODO Auto-generated method stub
	return this.color;
}


@Override
public void setColor(Color color) {
	this.color = color;
	
}

public ITronModel getTronModel() {
	return this.tronModel;
}

@Override
public void setTronModel(ITronModel tronModel) {
	this.tronModel = tronModel;
	this.getPosition().setMaxX(this.getTronModel().getGrid().getDimension().getWidth());
	this.getPosition().setMaxY(this.getTronModel().getGrid().getDimension().getHeight());
	
}


@Override
public boolean isPlayer(int player) {
	return false;
}


@Override
public void setDirection(Direction direction) {
	this.direction = direction;
	
}


@Override
public boolean isWeapon() {
	return true;
}


@Override
public IPosition getPosition() {
	return this.position;
}

}
