package bases.scenes.gameOver;

import bases.GameObject;
import bases.inputs.InputManager;
import bases.renderers.ImageRenderer;
import bases.scenes.Scene;
import bases.settings.Settings;
import tklibs.AudioUtils;

import java.awt.image.BufferedImage;
import java.io.InputStreamReader;

public class GameOver extends Scene {

    public GameOver(){
        AudioUtils.playSound("assets/music/nhạc nền.mp3",true);
    }

    @Override
    public void init() {
        addImage();
    }

    private void addImage() {
        GameObject.add(new GameOverBackground());
        GameObject.add(new ThankImage());
        GameObject.add(new GameOverButton());
    }

}
