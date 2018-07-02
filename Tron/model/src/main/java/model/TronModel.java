package model;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class TronModel extends Observable implements ITronModel{
	private Grid grid;
	private final ArrayList<ILightCycles> lightCycles;
	
	public TronModel() {
		this.lightCycles = new ArrayList<>();
		this.buildGrid();
	}
	
	@Override
	public IGrid getGrid() {
		// TODO Auto-generated method stub
		return this.grid;
	}

	@Override
	public void buildGrid() {
		// TODO Auto-generated method stub
		this.grid = new Grid();
		grid.createGrid();
	}

	
	

	

}
