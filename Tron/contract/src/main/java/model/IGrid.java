package model;

import java.util.ArrayList;
import java.util.Observer;

public interface IGrid extends Observer {
	public int getX();
	public int getY();
	public void createGrid();
	public WallEnum getWall();
	public void setWall(WallEnum wall);
	public IDimension getDimension();
	public ArrayList<ILightCycles> getLightCycles();
	public ILightCycles getMobileByPlayer(int player);
	void setMobilesHavesMoved();
	public ILightCycles getCopyOfLightCycles();
	public void addLightCycles(ILightCycles lightCycles);
}
