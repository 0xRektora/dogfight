package io.github.toolreaz.dogfight.model;

import java.util.ArrayList;
import java.util.Observable;

public class DogfightModel extends Observable {

    private IArea area;
    
    private Sky sky;
    
    private ArrayList<IMobile> mobiles;

    public DogfightModel() {

    }

    public void buildArea(Dimension dimension) {
        this.area = new Sky(dimension);
    }

    public void addMobile(Mobile mobile) {
    	mobiles.add(mobile);
    }

    public void removeMobile(Mobile mobile) {
    	mobiles.remove(mobiles.lastIndexOf(mobile));
    }

    public ArrayList<IMobile> getMobile() {
        return mobiles;
    }

    public IArea getArea() {
        return this.area;
    }
    
    public IMobile getMobileByPlayer(int player){
		return null;
    }
    
    public void setMobilesHavesMoved(){
    	
    }
}
