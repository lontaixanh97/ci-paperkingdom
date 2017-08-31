package bases.renderers;

import bases.Vector2D;
import tklibs.SpriteUtils;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;

/**
 * Created by huynq on 8/5/17.
 */
public class ImageRenderer implements Renderer {
    public BufferedImage image;
    public BufferedImage defaultImage;
    private Vector2D anchor;


    public ImageRenderer(BufferedImage image) {
        this.image = image;
        this.anchor = new Vector2D(0.5f, 0.5f);
    }

    public ImageRenderer(BufferedImage image, int dWidth, int dHeight, float degree){
        this.anchor = new Vector2D(0.5f, 0.5f);
        this.image = scale(image, dWidth, dHeight);
        this.defaultImage = this.image;
        this.image = rotate(this.image, Math.toRadians(degree));
    }

    public void rotate(float degree){
        this.image = rotate(this.defaultImage, Math.toRadians(degree));
    }

    public BufferedImage scale(BufferedImage imageToScale, int dWidth, int dHeight) {
        BufferedImage scaledImage = null;
        if (imageToScale != null) {
            scaledImage = new BufferedImage(dWidth, dHeight, imageToScale.getType());
            Graphics2D graphics2D = (Graphics2D) scaledImage.getGraphics();
            graphics2D.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
                    RenderingHints.VALUE_INTERPOLATION_BILINEAR);
            graphics2D.drawImage(imageToScale, 0, 0, dWidth, dHeight, null);
            graphics2D.dispose();
        }
        return scaledImage;
    }

    public static BufferedImage rotate(BufferedImage image, double angle) {
        double sin = Math.abs(Math.sin(angle)), cos = Math.abs(Math.cos(angle));
        int w = image.getWidth(), h = image.getHeight();
        int neww = (int)Math.floor(w*cos+h*sin), newh = (int)Math.floor(h*cos+w*sin);
        BufferedImage result = new BufferedImage(neww, newh, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g = result.createGraphics();
        g.translate((neww-w)/2, (newh-h)/2);
        g.rotate(angle, w/2, h/2);
        g.drawRenderedImage(image, null);
        g.dispose();
        return result;
    }

    public void render(Graphics2D g2d, Vector2D position) {
        g2d.drawImage(image,
                (int)(position.x - (image.getWidth() * anchor.x)),
                (int)(position.y - (image.getHeight() * anchor.y)),
                null);
    }

    public Vector2D getAnchor() {
        return anchor;
    }

    // Factory
    public static ImageRenderer create(String url) {
        return new ImageRenderer(SpriteUtils.loadImage(url));
    }

    public static ImageRenderer create(String url, int dWidth, int dHeight, float degree){
        return new ImageRenderer(SpriteUtils.loadImage(url), dWidth, dHeight, degree);
    }
}
