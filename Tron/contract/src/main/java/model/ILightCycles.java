package model;

import java.awt.Color;

public interface ILightCycles {
	public void move();
	public void setWidth(int width);
	public int getWidth();
	public void setHeight(int height);
	public int getHeight();
	public Direction getDirection();
	public void setColor(Color color);
	public Color getColor();
	public void setTronModel(ITronModel tronModel);
	public boolean isPlayer(int player);
	public void setDirection(Direction direction);
	public boolean isWeapon();
	public IPosition getPosition();
	void turnLeft();
	void turnRight();
}
