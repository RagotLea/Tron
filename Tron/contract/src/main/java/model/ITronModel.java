package model;

import java.util.ArrayList;

public interface ITronModel {
	public IGrid getGrid();
	public void buildGrid();
	public void addLightCycles(final ILightCycles lightCycles);
	public ArrayList<ILightCycles> getLightCycles();
	public ILightCycles getMobileByPlayer(final int player);
	public void setMobilesHavesMoved() ;
	
}
