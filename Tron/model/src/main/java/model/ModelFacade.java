package model;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

import model.dao.ExampleDAO;

/**
 * <h1>The Class ModelFacade provides a facade of the Model component.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public final class ModelFacade implements ITronModel  {
 TronModel model;
 Grid grid;
    /**
     * Instantiates a new model facade.
     */
    public ModelFacade() {
        super();
       grid = new Grid();
       model = new TronModel();
    }
    
    

    /*
     * (non-Javadoc)
     * @see model.IModel#getExampleById(int)
     */
 /*   @Override
    public Example getExampleById(final int id) throws SQLException {
        return ExampleDAO.getExampleById(id);
    }

    /*
     * (non-Javadoc)
     * @see model.IModel#getExampleByName(java.lang.String)
     */
  /*  @Override
    public Example getExampleByName(final String name) throws SQLException {
        return ExampleDAO.getExampleByName(name);
    }

    /*
     * (non-Javadoc)
     * @see model.IModel#getAllExamples()
     */
   /* @Override
    public List<Example> getAllExamples() throws SQLException {
        return ExampleDAO.getAllExamples();
    }*/



	public IGrid getGrid() {
		// TODO Auto-generated method stub
		return model.getGrid();
	}



	public ArrayList<ILightCycles> getLightCycles() {
		// TODO Auto-generated method stub
		return grid.getLightCycles();
	}



	public ILightCycles getMobileByPlayer(int player) {
		// TODO Auto-generated method stub
		return grid.getMobileByPlayer(player);
	}



	@Override
	public void buildGrid() {
		model.buildGrid();
		// TODO Auto-generated method stub
		
	}



	public void addLightCycles(ILightCycles lightCycles) {
		grid.addLightCycles(lightCycles);
		// TODO Auto-generated method stub
		
	}



	public void setMobilesHavesMoved() {
		grid.setMobilesHavesMoved();// TODO Auto-generated method stub
		
	}



	public ArrayList<ILightCycles> getCopyOfLightCycles() {
		return grid.getCopyOfLightCycles();
	}

}
