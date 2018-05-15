package io.github.toolreaz.dogfight.model;

import java.util.ArrayList;

public interface IDogfightModel {

    IArea getArea();

    void buildArea(Dimension dimension);

    void addMobile(IMobile mobile);

    void removeMobile(IMobile mobile);

    ArrayList<IMobile> getMobiles();

    IMobile getMobileByPlayer(int player);

    void setMobilesHavesMoved();

}
