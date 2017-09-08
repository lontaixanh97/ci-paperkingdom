package bases.scenes.gameOver;

import bases.GameObject;
import bases.Vector2D;
import bases.renderers.Animation;
import bases.renderers.ImageRenderer;
import bases.settings.Settings;

public class PlayGameImage extends GameObject {
    @Override
    public void run(Vector2D parentPosition) {
        super.run(parentPosition);
    }

    public void add(int type){
        if(type == 1)
            this.renderer = ImageRenderer.create("assets/menus/start-white.png");
        if(type == 2)
            this.renderer = ImageRenderer.create("assets/menus/start-color.png");
        this.position.set(Settings.instance.getGamePlayWidth() / 2, Settings.instance.getGamePlayHeight() / 2);
        GameObject.add(this);
    }
}
