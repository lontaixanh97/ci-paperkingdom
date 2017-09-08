package maps;

import bases.GameObject;
import bases.physics.BoxCollider;
import bases.physics.PhysicsBody;
import bases.renderers.ImageRenderer;
import bases.utils.Utils;
import com.google.gson.Gson;
import tklibs.SpriteUtils;

import java.util.List;

public class Map {

    private List<Layer> layers;

    @Override
    public String toString() {
        return "Map{" +
                "layers=" + layers +
                '}';
    }

    public void generate(){
        if(layers.size() > 0){
            Layer layer = layers.get(0);
            layer.generate();
        }
    }

    public static Map load(String url) {
        String mapContent = Utils.readTextFile(url);
        Gson gson = new Gson();
        return gson.fromJson(mapContent, Map.class);
    }
}
