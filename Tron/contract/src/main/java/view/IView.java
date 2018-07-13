package view;

import java.awt.Graphics;
import java.io.IOException;

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
    public void setGrid(IGrid iGrid) throws IOException;
	void closeAll();
}
