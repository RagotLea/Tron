package main;

import java.awt.Graphics;
import java.sql.SQLException;

import controller.ControllerFacade;
import model.Grid;
import model.IGrid;
import model.ILightCycles;
import model.ModelFacade;
import model.WallEnum;
import view.ITronGraphicsBuilder;
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
           /* final ITronModel tronModel = new TronModel();
            final IDimension dimension;
            final IGrid grid = new Grid();
            final ILightCycle lightCycle = new LightCycle(, , );
            final ITronController tronController;
            final IViewSystem viewSystem = new ViewSystem();
            final IPosition positon = new position();

            grid.createGrid(); //dimension(400, 600);
            grid.addLightCycle(new LightCycle(0, 10, color.blue));
            grid.addLightCycle(new LightCycle(1, new position(10, 590), "red"));
            TronController.setViewSystem(IViewSystem viewSystem);
            TronController.play();
        }  try {
                controller.start();
            } catch (final SQLException exception) {
                exception.printStackTrace();
            }
        }*/
    	
     final ControllerFacade controller = new ControllerFacade(new ViewFacade(), new ModelFacade());

      /*  try {
            controller.start();
        } catch (final SQLException exception) {
            exception.printStackTrace();
        }*/
    		
    }

    	
}
