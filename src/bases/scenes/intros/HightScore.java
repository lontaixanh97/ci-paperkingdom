package bases.scenes.intros;

import bases.GameObject;
import bases.Vector2D;
import bases.renderers.ImageRenderer;
import tklibs.SpriteUtils;

public class HightScore extends GameObject {
    private ImageRenderer imageRenderer;

    public HightScore() {
        super();
        this.imageRenderer = new ImageRenderer(
                SpriteUtils.loadImage("assets/images/best.png")
        );
        this.imageRenderer.getAnchor().set(0, 0);
        this.position.set(100, 300);
        this.renderer = imageRenderer;
    }

    @Override
    public void run(Vector2D parentPosition) {
        super.run(parentPosition);
    }
}
