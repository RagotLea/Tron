package model;

public class Wall {
	public WallEnum wall;
	
	
	public void createWall() {
		switch(wall){
		case SPACE : 
			createSpace();
		case RED_WALL :
			createRedWall();
		case BLUE_WALL:
			createBlueWall();
		}
	}
	
	public void createSpace() {
		System.out.println('_');
	}
	
	public void createRedWall() {
		System.out.println('R');
	}
	
	public void createBlueWall() {
		System.out.println('B');
	}
}
