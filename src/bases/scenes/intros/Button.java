package bases.scenes.intros;

import bases.FrameCounter;
import bases.GameObject;
import bases.Vector2D;
import bases.inputs.InputManager;
import bases.renderers.ImageRenderer;
import bases.scenes.Lv1Scene;
import bases.scenes.SceneManager;
import tklibs.SpriteUtils;

public class Button extends GameObject {
    private ImageRenderer imageRenderer;
    private InputManager inputManager;
    private FrameCounter frameCounter;

    public Button() {
        super();
        this.imageRenderer = new ImageRenderer(
                SpriteUtils.loadImage("assets/images/green_square_small.png")
        );
        this.imageRenderer.getAnchor().set(0, 0);
        this.renderer = imageRenderer;
        frameCounter = new FrameCounter(5);
        this.position.set(50,100);
    }

    @Override
    public void run(Vector2D parentPosition) {
        super.run(parentPosition);
        if(frameCounter.run()) {
            frameCounter.reset();
            if (inputManager.upPressed && this.position.y > 100)
                position.addUp(0, -100);
            if (inputManager.downPressed && this.position.y < 300)
                position.addUp(0, 100);
            if(inputManager.enterPressed && this.position.y == 100){
                SceneManager.changeScene(new Lv1Scene());
            }
        }

    }
    public void setInputManager(InputManager inputManager) {
        this.inputManager = inputManager;
    }
}
