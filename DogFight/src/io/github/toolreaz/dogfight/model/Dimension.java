package io.github.toolreaz.dogfight.model;

public class Dimension {

    private int width;
    private int height;

    public Dimension(int w, int h) {
        this.width = w;
        this.height = h;
    }

    public Dimension(Dimension dim) {
        this.width = dim.width;
        this.height = dim.height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
