package io.github.toolreaz.dogfight.model;

import java.awt.*;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Mobile implements IMobile {

    private int speed;
    private Direction direction;
    private Position position;
    private Dimension dimension;
    private String images;

    public Mobile(Direction dir, Position pos, Dimension dim, int spd, String img) {
        this.direction = dir;
        this.position = pos;
        this.dimension = dim;
        this.speed = spd;
        this.images = img;
    }

    public void move() {
        switch (this.direction) {
            case UP:
                this.position.setY(this.position.getY() - this.getSpeed());
                break;
            case DOWN:
                this.position.setY(this.position.getY() + this.getSpeed());
                break;
            case LEFT:
                this.position.setX(this.position.getX() - this.getSpeed());
                break;
            case RIGHT:
                this.position.setX(this.position.getX() + this.getSpeed());
                break;
        }
    }

    public void placeInArea(IArea area) {

    }

    public boolean isPlayer(int player) {
        return false;
    }

    private void moveUp() {
        this.direction = Direction.UP;
    }

    private void moveRight() {
        this.direction = Direction.UP;
    }

    private void moveDown() {
        this.direction = Direction.UP;
    }

    private void moveLeft() {
        this.direction = Direction.UP;
    }

    public boolean hit() {
        return true;
    }

    public boolean isWeapon() {
        return true;
    }





    /* GETTERS & SETTERS */

    public int getSpeed() {
        return this.speed;
    }

    public Direction getDirection() {
        return this.direction;
    }

    public Position getPosition() {
        return this.position;
    }

    public Dimension getDimension() {
        return this.dimension;
    }

    public Image getImage() {
    	Image output=null;
        try {
			output= ImageIO.read(new File(this.images));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return output;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public Color getColor() {
		return null;
    }

    public int getHeight() {
        return this.dimension.getHeight();
    }

    public int getWidth() {
        return this.dimension.getWidth();
    }

    public void setDogfightMode(DogfightModel dogfightModel) {

    }
    
    public IDogfightModel getDogfightModel(){
		return null;
    }
}