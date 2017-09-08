package bases.scenes;

import bases.GameObject;

import java.awt.*;
import java.awt.event.KeyEvent;

/**
 * Created by huynq on 8/23/17.
 */
public abstract class Scene {

    public void destroy() {
        GameObject.clearAll();
    }

    public abstract void init();


}
