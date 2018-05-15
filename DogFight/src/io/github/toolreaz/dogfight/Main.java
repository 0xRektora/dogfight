package io.github.toolreaz.dogfight;

import io.github.toolreaz.dogfight.controller.DogfightController;
import io.github.toolreaz.dogfight.model.DogfightModel;
import io.github.toolreaz.dogfight.view.DogfightView;

public class Main {

    public static void main(String args[]) {
    	final DogfightModel dogfightModel = new DogfightModel();
    	final DogfightController dogfightController = new DogfightController(dogfightModel);
    	final DogfightView dogfightView = new DogfightView(dogfightController, dogfightModel, dogfightModel);
    	dogfightController.setViewSystem(dogfightView);
    	dogfightController.play();
    }
}