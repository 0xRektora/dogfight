package io.github.toolreaz.dogfight.model;

import java.awt.*;

public class Missile extends Mobile {

    private final static int SPEED = 4;
    private final static int WIDTH = 100;
    private final static int HEIGHT = 30;
    private final static int MAX_DISTANCE_TRAVELED = 1400;
    private final static String IMAGE = "missile";
private final static int distanceTraveled = 0;
    
    public Missile(Direction dir, Position pos, Dimension dim) {
        super(dir, pos, dim, SPEED, IMAGE);
    }
    
    public int getWidthWithADirection(Direction direction){
		return 0;
    }
    
    public int getHeightWithADirection(Direction direction){
		return 0;
    }
    public void move(){
    	
    }
    public boolean isWeapon(){
		return true;
    }
}