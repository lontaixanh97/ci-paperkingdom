package bases.scenes.gameOver;

import bases.FrameCounter;
import bases.GameObject;
import bases.Vector2D;
import bases.inputs.InputManager;
import bases.scenes.Lv1Scene;
import bases.scenes.SceneManager;
import bases.scenes.intros.IntroScene;
import tklibs.AudioUtils;

public class GameOverButton extends GameObject {
    private FrameCounter frameCounter;
    private InputManager inputManager = InputManager.instance;
    QuitImage quitImage = new QuitImage();
    PlayGameImage playGameImage = new PlayGameImage();
    private int type1 ;
    private int type2 ;
    private int currentButton = 0 ;

    public GameOverButton(){
        frameCounter = new FrameCounter(5);
    }

    @Override
    public void run(Vector2D parentPosition) {
        super.run(parentPosition);
        if(frameCounter.run()) {
            frameCounter.reset();
            if (inputManager.upPressed) {
                currentButton = (currentButton + 2) % 3;
            }
            if(inputManager.downPressed){
                currentButton = (currentButton + 1) % 3;
            }
            if(inputManager.enterPressed && currentButton ==0){
                SceneManager.changeScene(new IntroScene());
            }
        }
            if(currentButton == 0){
                type1 = 2;
                type2 = 1;
            }
            if(currentButton == 1){
                type1 = 1;
                type2 = 2;
            }
            if(currentButton == 2){
                type1 = type2 = 1;
            }
            addButton();

    }
    private void addButton() {
        playGameImage.add(type1);
        quitImage.add(type2);
    }

}
