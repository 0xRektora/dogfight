package io.github.toolreaz.dogfight.model;

import java.awt.*;

public class Sky implements IArea {

    private Image image;
    private Dimension dimension;

    public Sky(Dimension dim) {
        this.dimension = dim;
    }

    public Dimension getDimension() {
        return this.dimension;
    }

    public Image getImage() {
        return this.image;
    }
}
