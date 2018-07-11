package view;

import java.awt.Graphics;

import controller.IOrderPerformer;
import model.IGrid;

/**
 * <h1>The Interface IView.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public interface IView {

    /**
     * Display message.
     *
     * @param message
     *            the message
     */
    void displayMessage(String message);
    public void drawAllLightCycles(final Graphics graphics);
    public void setGrid(IGrid iGrid);
	void setOrderPerformer(IOrderPerformer orderPerformer);
}
