package model;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public interface ITronModel {
	public IGrid getGrid();
	public void buildGrid();
	public void addLightCycles(final ILightCycles lightCycles);
	public ArrayList<ILightCycles> getLightCycles();
	public ILightCycles getMobileByPlayer(final int player);
	public void setMobilesHavesMoved() ;
}
