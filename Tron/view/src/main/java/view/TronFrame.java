package view;

import java.awt.Graphics;

import javax.swing.JFrame;
import model.IGrid;

public class TronFrame extends JFrame {
	private static final long	serialVersionUID	= -1112124206501543946L;
	public static final int		ZOOM= 3;
	public Graphics graphics;
	
	public TronFrame(final String title, final IGrid grid) {
		this.setTitle(title);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setVisible(true);

		final TronPanel tronPanel = new TronPanel(new TronGraphicsBuilder(grid, graphics));
		this.setContentPane(tronPanel);
		this.setSize((grid.getX() * ZOOM) + this.getInsets().left + this.getInsets().right,
				(grid.getY() * ZOOM) + this.getInsets().top + this.getInsets().bottom);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		//grid.addObserver(tronPanel);
	}
}
