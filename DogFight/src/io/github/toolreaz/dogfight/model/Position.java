package io.github.toolreaz.dogfight.model;

public class Position {

    private double x;
    private double y;
    private double maxX;
    private double maxY;

    public Position(Position pos) {
        this.x = pos.x;
        this.y = pos.y;
        this.maxX = pos.maxX;
        this.maxY = pos.maxY;
    }

    public Position(double x, double y, double maxX, double maxY) {
        this.x = x;
        this.y = y;
        this.maxX = maxX;
        this.maxY = maxY;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getMaxX() {
        return maxX;
    }

    public double getMaxY() {
        return maxY;
    }

    protected void setMaxX(double maxX) {
        this.maxX = maxX;
    }

    protected void setMaxY(double maxY) {
        this.maxY = maxY;
    }
}
