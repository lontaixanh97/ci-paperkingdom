package bases.inputs;

import java.awt.event.KeyEvent;

import static java.awt.event.KeyEvent.*;

/**
 * Created by huynq on 8/2/17.
 */
public class InputManager {
    public boolean upPressed;
    public boolean downPressed;
    public boolean leftPressed;
    public boolean rightPressed;
    public boolean enterPressed;
    public boolean xPressed;

    public boolean aPressed;
    public boolean dPressed;

    public static final InputManager instance = new InputManager();

    private InputManager() {

    }

    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case VK_RIGHT:
                rightPressed = true;
                break;
            case VK_LEFT:
                leftPressed = true;
                break;
            case VK_UP:
                upPressed = true;
                break;
            case VK_DOWN:
                downPressed = true;
                break;
            case VK_X:
                xPressed = true;
                break;
            case VK_A:
                aPressed = true;
                break;
            case VK_D:
                dPressed = true;
                break;
            case VK_ENTER:
                enterPressed = true;
                break;
        }
    }

    public void keyReleased(KeyEvent e) {
        switch (e.getKeyCode()) {
            case VK_RIGHT:
                rightPressed = false;
                break;
            case VK_LEFT:
                leftPressed = false;
                break;
            case VK_UP:
                upPressed = false;
                break;
            case VK_DOWN:
                downPressed = false;
                break;
            case VK_X:
                xPressed = false;
                break;
            case VK_A:
                aPressed = false;
                break;
            case VK_D:
                dPressed = false;
                break;
            case VK_ENTER:
                enterPressed = false;
                break;
        }
    }
}
