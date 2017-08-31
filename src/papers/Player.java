package papers;

import bases.GameObject;
import bases.Vector2D;
import bases.inputs.InputManager;
import bases.renderers.ImageRenderer;

public class Player extends GameObject{
    private static final float SPEED = 5;
    private static final float ANGULARSPEED = 1;
    private Vector2D velocity;
    private float angularSpeed;
    private float angle;
    private ImageRenderer imageRenderer;

    public Player() {
        super();
        imageRenderer = ImageRenderer.create("assets/images/yellow_square.jpg", 70, 100, 60);
        this.renderer = imageRenderer;
        this.velocity = new Vector2D();
        angle = 0;
    }

    @Override
    public void run(Vector2D parentPosition) {
        super.run(parentPosition);
        move();
        rotate();
    }

    private void rotate() {
        angularSpeed = 0;
        if (InputManager.instance.aPressed){
            angularSpeed -= ANGULARSPEED;
        }
        if (InputManager.instance.dPressed){
            angularSpeed += ANGULARSPEED;
        }
        angle += angularSpeed;
        imageRenderer.rotate(angle);
    }

    private void move() {
        velocity.set(0,0);
        if (InputManager.instance.upPressed){
            velocity.y -= SPEED;
        }
        if (InputManager.instance.downPressed){
            velocity.y += SPEED;
        }
        if (InputManager.instance.leftPressed){
            velocity.x -= SPEED;
        }
        if (InputManager.instance.rightPressed){
            velocity.x += SPEED;
        }
        this.position.addUp(velocity);
        //screenPosition.addUp(velocity);
    }
}
