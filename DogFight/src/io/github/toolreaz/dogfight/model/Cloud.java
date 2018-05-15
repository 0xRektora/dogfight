package io.github.toolreaz.dogfight.model;

import java.awt.*;

public class Cloud extends Mobile {

    private final static int SPEED = 1;
    private final static int WIDTH = 300;
    private final static int HEIGHT = 150;
    private final static String IMAGE = "cloud";

    public Cloud(Direction dir, Position pos, Dimension dim) {
        super(dir, pos, dim, SPEED, IMAGE);
    }
}