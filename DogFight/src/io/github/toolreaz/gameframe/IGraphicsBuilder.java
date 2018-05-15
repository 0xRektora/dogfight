package io.github.toolreaz.gameframe;

import java.awt.*;
import java.awt.image.ImageObserver;

public interface IGraphicsBuilder {

    void applyModelToGraphics(Graphics graphics, ImageObserver observer);

    int getGlobalWidth();

    int getGlobalHeight();
}
