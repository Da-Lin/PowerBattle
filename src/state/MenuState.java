/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

import powerbattle.ClickListener;
import UserInterface.UIImageButton;
import UserInterface.UIManager;
import state.State;
import graphics.Assets;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import powerbattle.Game;
import powerbattle.Handler;

/**
 *
 * @author Brijesh
 */
public class MenuState extends State {

    private UIManager uiManager;
    

    public MenuState(final Handler handler) {

        super(handler);
        uiManager = new UIManager(handler);
        handler.getMouseManager().setUIManager(uiManager);

          uiManager.addObject(new UIImageButton(240, 350, 148, 76, Assets.play, new ClickListener() {
            @Override
            public void onClick() {
                ModeState modeState = new ModeState(handler);
                State.setState(modeState);
            }
        }));
        
        uiManager.addObject(new UIImageButton(640, 350, 148, 76, Assets.controls, new ClickListener() {
            @Override
            public void onClick() {
                ControlState controlState = new ControlState(handler);
                State.setState(controlState);
            }
        }));
        
        uiManager.addObject(new UIImageButton(440, 525, 148, 76, Assets.quit, new ClickListener() {
            @Override
            public void onClick() {
                System.exit(0);
            }
        }));

    }

    @Override
    public void update() {
        uiManager.update();

    }

    @Override

    public void render(Graphics g, int time) {

        uiManager.render(g);
    }

}
