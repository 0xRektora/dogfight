package io.github.toolreaz.dogfight.model;

public class Plane extends Mobile {

    private final static int SPEED = 2;
    private final static int WIDTH = 100;
    private final static int HEIGHT = 30;
    private int player;

    public Plane(Direction dir, Position pos, Dimension dim, String image) {
        super(dir, pos, dim, SPEED, image);
    }
    public boolean isPlayer(int player){
		return false;
    }
    public boolean hit(){
    	return false;
    }
}