package bases.scenes.intros;

import bases.GameObject;
import bases.Vector2D;
import bases.renderers.ImageRenderer;
import bases.settings.Settings;
import tklibs.SpriteUtils;

public class IntroBackground extends GameObject {
        private ImageRenderer imageRenderer;

        public IntroBackground() {
            super();
            this.imageRenderer = new ImageRenderer(
                    SpriteUtils.loadImage("assets/images/intro.png")
            );
            this.imageRenderer.getAnchor().set(0, 1);
            this.position.set(0, Settings.instance.getGamePlayHeight());
            this.renderer = imageRenderer;
        }

        @Override
        public void run(Vector2D parentPosition) {
            super.run(parentPosition);
        }
    }

