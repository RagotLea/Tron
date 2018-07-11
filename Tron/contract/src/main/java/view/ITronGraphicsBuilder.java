package view;

import java.awt.Color;

public interface ITronGraphicsBuilder {

	void createWall(int x, int y, Color color);

	void createBlueWall(int x, int y, Color color);

	void createRedWall(int x, int y, Color color);

	void createGround(int x, int y, Color color);
}
