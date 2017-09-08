package bases.scenes.gameOver;

import bases.GameObject;
import bases.Vector2D;
import bases.renderers.ImageRenderer;
import bases.settings.Settings;

public class ThankImage extends GameObject {
    public ThankImage(){
        super();
        this.renderer = ImageRenderer.create("assets/menus/thanks-for-playing.png");
    }

    @Override
    public void run(Vector2D parentPosition) {
        super.run(parentPosition);
        this.position.set(Settings.instance.getGamePlayWidth() / 2, Settings.instance.getGamePlayHeight() / 2 + 60);
    }
}
