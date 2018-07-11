package view;

import java.awt.Graphics;
import java.awt.event.KeyEvent;

import javax.swing.JOptionPane;

import controller.IController;
import controller.IOrderPerformer;
import model.IGrid;
import model.ILightCycles;
import model.ITronModel;

/**
 * <h1>The Class ViewFacade provides a facade of the View component.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public class ViewFacade implements IView, IEventPerformer {
	IGrid grid;
	ITronModel tron;
	IOrderPerformer order;
TronGraphicsBuilder graphicBuilder; 
TronFrame frame;
EventPerformer event;
Graphics graphics;
IController controller;
    /**
     * Instantiates a new view facade.
     */
    public ViewFacade() {
        super();
        this.frame = new TronFrame("test", tron);
        graphicBuilder = new TronGraphicsBuilder(grid, graphics);
        event = new EventPerformer(order);
        this.drawAllLightCycles(graphics);
        }
    
    @Override
    public void setGrid(IGrid grid) {
    	this.grid = grid;
    }

    /*
     * (non-Javadoc)
     * @see view.IView#displayMessage(java.lang.String)
     */
    @Override
    public final void displayMessage(final String message) {
        JOptionPane.showMessageDialog(null, message);
    }

    public final void drawAllLightCycles(final Graphics graphics) {
    	graphicBuilder.applyModelToGraphic(graphics);
    }

	@Override
	public void eventPerform(KeyEvent keyCode) {
		event.eventPerform(keyCode);
		
	}

	@Override
	public void setOrderPerformer(IOrderPerformer orderPerformer) {
		this.order = orderPerformer;
		
	}
}
