package view;

import java.awt.Color;
import java.awt.Graphics;

import model.IGrid;
import model.ILightCycles;
import model.WallEnum;


public class TronGraphicsBuilder implements ITronGraphicsBuilder {
	private final IGrid grid;
	final Graphics graphics;
	final static  Color color = null;
	WallEnum wall;
	ILightCycles lightcycles;

	public TronGraphicsBuilder(final IGrid grid, final Graphics graphics) {
		this.grid = grid;
		this.graphics = graphics;
	}

	//private void clearGraphics(final Graphics graphics) {
	//	graphics.clearRect(0, 0, this.grid.getX() * TronFrame.ZOOM, this.grid.getY() * TronFrame.ZOOM);
	//}

	public void createWall(){
		wall = grid.getWall();
		switch (wall) {
		case SPACE:
			this.drawSpace();
		}
	}
	public void drawSpace() {
		graphics.setColor(color.RED);
		graphics.fillRect(1, 1, TronFrame.ZOOM, TronFrame.ZOOM);

		
	}
	private void drawAllLightCycles(final Graphics graphics) {
		for (final ILightCycles lightCycles : this.grid.getCopyOfLightCycles()){
			this.drawLightCycles(graphics, lightCycles);
		}
	}

	private void drawLightCycles(final Graphics graphics, final ILightCycles lightCycles) {
		graphics.setColor(lightCycles.getColor());
		graphics.fillRect(lightCycles.getWidth() * TronFrame.ZOOM, lightCycles.getHeight() * TronFrame.ZOOM, TronFrame.ZOOM, TronFrame.ZOOM);
	}

	public void applyModelToGraphic(final Graphics graphics) {
		//this.clearGraphics(graphics);
		this.drawAllLightCycles(graphics);
	}
}
