package model;

public interface IGrid {
	public int getX();
	public int getY();
	public void createGrid();
	public WallEnum getWall();
	public void setWall(WallEnum wall);
}
