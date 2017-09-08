package bases.scenes.intros;

import bases.Constraints;
import bases.GameObject;
import bases.inputs.InputManager;
import bases.scenes.Lv1Scene;
import bases.scenes.Scene;
import bases.scenes.SceneManager;
import bases.settings.Settings;
import tklibs.AudioUtils;

import javax.sound.sampled.Clip;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;

public class IntroScene extends Scene {
    Settings settings = Settings.instance;
    Clip clip;
    Button button = new Button();


    public IntroScene(){
        clip = AudioUtils.playSound("assets/music/lactroi.wav", true);

    }

    @Override
    public void init() {
        addBackground();
        addButton();
    }


    private void addButton() {
        button.setInputManager(InputManager.instance);
        GameObject.add(button);
    }

    private void addBackground() {
        GameObject.add(new IntroBackground());
        GameObject.add(new StartButton());
        GameObject.add(new ChangeMusic());
        GameObject.add(new HightScore());
    }
}
