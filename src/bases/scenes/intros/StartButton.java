package bases.scenes.intros;

import bases.GameObject;
import bases.Vector2D;
import bases.renderers.ImageRenderer;
import bases.settings.Settings;
import tklibs.SpriteUtils;

public class StartButton extends GameObject {
    private ImageRenderer imageRenderer;

    public StartButton() {
        super();
        this.imageRenderer = new ImageRenderer(
                SpriteUtils.loadImage("assets/images/startGame.png")
        );
        this.imageRenderer.getAnchor().set(0, 0);
        this.position.set(100, 100);
        this.renderer = imageRenderer;
    }

    @Override
    public void run(Vector2D parentPosition) {
        super.run(parentPosition);
    }
}
