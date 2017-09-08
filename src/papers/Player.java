package papers;

import bases.GameObject;
import bases.Vector2D;
import bases.inputs.InputManager;
import bases.physics.BoxCollider;
import bases.physics.PhysicsBody;
import bases.renderers.ImageRenderer;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Player extends GameObject implements PhysicsBody {
    private static final float SPEED = 5;
    private static final float ANGULARSPEED = 1;
    private Vector2D velocity;
    private float angularSpeed;
    private ImageRenderer imageRenderer;
    private BoxCollider boxCollider;

    public Player() {
        super();
        imageRenderer = ImageRenderer.create("assets/images/yellow_square.jpg");
        this.renderer = imageRenderer;
        this.velocity = new Vector2D();

        boxCollider = new BoxCollider(70,100);
        this.children.add(boxCollider);
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

    @Override
    public BoxCollider getBoxCollider() {
        return this.boxCollider ;
    }
}
