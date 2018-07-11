package view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.ImageObserver;

import model.IGrid;
import model.ILightCycles;
import model.ITronModel;
import model.Imodel;
import model.WallEnum;


public class TronGraphicsBuilder implements ITronGraphicsBuilder {
	private final IGrid grid;
	final Graphics graphics;
	private WallEnum wall;
	ILightCycles lightcycles;
	ITronModel tronModel;
	Imodel model;

	public TronGraphicsBuilder(final IGrid grid, final Graphics graphics) {
		this.grid = grid;
		this.graphics = graphics;
	}

	//private void clearGraphics(final Graphics graphics) {
	//	graphics.clearRect(0, 0, this.grid.getX() * TronFrame.ZOOM, this.grid.getY() * TronFrame.ZOOM);
	//}

	public void draw() {
		Color color = null;
		for (int i= 0; i<= 600; i++) {
			for (int j = 2; j <= 400; j++) {
				switch (wall) {
				case GROUND:
					createGround(i,j, color.white);
				case RED_WALL:
					createRedWall(i,j,color.red);
				case BLUE_WALL:
					createBlueWall(i,j,color.blue);
				case WALL:
					createWall(i,j,color.BLACK);
				}
			}
		}
	}
	
	protected WallEnum getWall() {
		return wall;
	}

	protected void setWall(WallEnum wall) {
		this.wall = wall;
	}
	
	@Override
	public void createGround(int x , int y, Color color) {
		graphics.setColor(color);
		graphics.fillRect(x, y, 1, 1);
	}
	
	@Override
	public void createRedWall(int x, int y, Color color) {
		graphics.setColor(color);
		graphics.fillRect(x, y, 1, 1);
	}
	
	@Override
	public void createBlueWall(int x, int y, Color color) {
		graphics.setColor(color);
		graphics.fillRect(x, y, 1, 1);
	}
	
	@Override
	public void createWall(int x , int y, Color color) {
		graphics.setColor(color);
		graphics.fillRect(x, y, 1, 1);
	}
	
	/*private void drawAllLightCycles(final Graphics graphics) {
		for (final ILightCycles lightCycles : this.grid.getCopyOfLightCycles()){
			this.drawLightCycles(graphics, lightCycles);
		}
	}*/

	private void drawLightCycles(final Graphics graphics, final ILightCycles lightCycles) {
		graphics.setColor(lightCycles.getColor());
		graphics.fillRect(lightCycles.getWidth() * TronFrame.ZOOM, lightCycles.getHeight() * TronFrame.ZOOM, TronFrame.ZOOM, TronFrame.ZOOM);
	}

	public void applyModelToGraphic(final Graphics graphics) {
		//this.clearGraphics(graphics);
		//this.drawAllLightCycles(graphics);
		this.draw();
	}

	
}

