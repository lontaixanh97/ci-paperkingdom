package bases.scenes.intros;

import bases.GameObject;
import bases.Vector2D;
import bases.renderers.ImageRenderer;
import tklibs.SpriteUtils;

public class ChangeMusic extends GameObject {
    private ImageRenderer imageRenderer;

    public ChangeMusic() {
        super();
        this.imageRenderer = new ImageRenderer(
                SpriteUtils.loadImage("assets/images/musicON.png")
        );
        this.imageRenderer.getAnchor().set(0, 0);
        this.position.set(100, 200);
        this.renderer = imageRenderer;
    }

    @Override
    public void run(Vector2D parentPosition) {
        super.run(parentPosition);
    }
}
