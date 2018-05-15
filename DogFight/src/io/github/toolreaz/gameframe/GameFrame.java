package io.github.toolreaz.gameframe;

import io.github.toolreaz.dogfight.controller.IOrderPerformer;
import io.github.toolreaz.dogfight.controller.IUserOrder;
import io.github.toolreaz.dogfight.controller.UserOrder;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Observable;

public class GameFrame extends JFrame implements KeyListener {

    private IEventPerformer performer;

    public GameFrame(String title, IEventPerformer performer, IGraphicsBuilder graphicsBuilder, Observable observable) {

        this.performer = performer;

        this.setName(title);

    }

    public void keyPressed(KeyEvent k) {

        performer.eventPerform(k);

    }

    public void keyReleased(KeyEvent keyEvent) {

    }

    public void keyTyped(KeyEvent keyEvent) {

    }
}
