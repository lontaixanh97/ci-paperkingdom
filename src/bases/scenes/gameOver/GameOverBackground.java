package bases.scenes.gameOver;

import bases.GameObject;
import bases.Vector2D;
import bases.renderers.Animation;
import bases.renderers.ImageRenderer;
import bases.settings.Settings;

public class GameOverBackground extends GameObject {
    public GameOverBackground(){
        this.renderer = ImageRenderer.create("assets/images/Game_Over.png");
        this.position.set(Settings.instance.getGamePlayWidth() / 2, Settings.instance.getGamePlayHeight() /4);
    }
    @Override
    public void run(Vector2D parentPosition) {
        super.run(parentPosition);
    }
}
