package io.github.toolreaz.dogfight.model;

import java.awt.*;

public interface IMobile {

    Direction getDirection();

    void setDirection(Direction dir);

    Position getPosition();

    Dimension getDimension();

    int getWidth();

    int getHeight();

    int getSpeed();

    Image getImage();

    void move();

    void placeInArea(IArea area);

    boolean isPlayer(int player);

    void setDogfightMode(DogfightModel dogfightModel);

    boolean hit();

    boolean isWeapon();

}
