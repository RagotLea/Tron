package model;

import view.ITronGraphicsBuilder;

public class Wall {
	public WallEnum wall;
	ITronGraphicsBuilder builder;
	
	
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
		
	}
	
	public void createRedWall() {
		System.out.println('R');
	}
	
	public void createBlueWall() {
		System.out.println('B');
	}
}
