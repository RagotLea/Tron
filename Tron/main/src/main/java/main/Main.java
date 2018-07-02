package main;

import java.awt.Graphics;
import java.sql.SQLException;

import controller.ControllerFacade;
import model.Grid;
import model.IGrid;
import model.ILightCycles;
import model.ModelFacade;
import view.ViewFacade;

/**
 * <h1>The Class Main.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public abstract class Main {
    /**
     * The main method.
     *
     * @param args
     *            the arguments
     */
    public static void main(final String[] args) {
       final ControllerFacade controller = new ControllerFacade(new ViewFacade(), new ModelFacade(), new Grid());

        try {
            controller.start();
        } catch (final SQLException exception) {
            exception.printStackTrace();
        }

    }

    	
}
