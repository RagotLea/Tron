package model;

import java.util.Observer;

public interface IGrid extends Observer {
	public int getX();
	public int getY();
	public void createGrid();
	public WallEnum getWall();
	public void setWall(WallEnum wall);
}
