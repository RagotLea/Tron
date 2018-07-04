package view;

import java.awt.Graphics;

import javax.swing.JFrame;
import model.IGrid;
import model.ITronModel;

public class TronFrame extends JFrame {
	private static final long	serialVersionUID	= -1112124206501543946L;
	public static final int		ZOOM= 3;
	public Graphics graphics;
	IGrid grid;
	
	public TronFrame(final String title, final ITronModel tron) {
		this.setTitle(title);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setVisible(true);

		final TronPanel tronPanel = new TronPanel(new TronGraphicsBuilder(grid, graphics));
		this.setContentPane(tronPanel);
		this.setSize(600 * ZOOM + this.getInsets().left + this.getInsets().right,
				600 * ZOOM + this.getInsets().top + this.getInsets().bottom);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		//grid.addObserver(tronPanel);
	}
}
