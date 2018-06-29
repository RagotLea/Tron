package view;

import java.awt.Graphics;

import model.IGrid;
import model.ILightCycles;


public class TronGraphicsBuilder {
	private final IGrid grid;

	public TronGraphicsBuilder(final IGrid grid) {
		this.grid = grid;
	}

	//private void clearGraphics(final Graphics graphics) {
	//	graphics.clearRect(0, 0, this.grid.getX() * TronFrame.ZOOM, this.grid.getY() * TronFrame.ZOOM);
	//}

	//private void drawAllJavaCell(final Graphics graphics) {
		//for (final JavaCell javaCell : this.grid.getCopyOfJavaCells()) {
		//	this.drawJavaCell(graphics, javaCell);
		//}
	//}

	private void drawJavaCell(final Graphics graphics, final ILightCycles lightCycles) {
		graphics.setColor(lightCycles.getColor());
		graphics.fillRect(lightCycles.getWidth() * TronFrame.ZOOM, lightCycles.getHeight() * TronFrame.ZOOM, TronFrame.ZOOM, TronFrame.ZOOM);

	}

	public void applyModelToGraphic(final Graphics graphics) {
		//this.clearGraphics(graphics);
		//this.drawAllJavaCell(graphics);
	}
}
