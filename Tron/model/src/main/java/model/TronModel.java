package model;

import java.util.ArrayList;
import java.util.Observable;

public class TronModel extends Observable implements ITronModel{
	private Grid grid;
	private final ArrayList<ILightCycles> lightCycles;
	
	public TronModel() {
		this.lightCycles = new ArrayList<>();
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
	}

	@Override
	public void addLightCycles(ILightCycles lightCycles) {
		this.lightCycles.add(lightCycles);
		lightCycles.setTronModel(this);
		
	}

	@Override
	public ArrayList<ILightCycles> getLightCycles() {
		// TODO Auto-generated method stub
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

}
