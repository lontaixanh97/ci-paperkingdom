package bases.scenes;

import bases.GameObject;
import maps.Map;
import papers.Player;

public class Lv1Scene extends Scene {
    @Override
    public void init() {
        setupPlayers();
        //addMap();
        
    }

    private void addMap() {
        float startX = 30;
        float startY = 600;
        for (int i = 0 ; i < 10 ; i++) {
            Map map = new Map();
            //map.getPosition().set(startX, startY);
            //GameObject.add(map);
            startX += 30;
        }
    }

    private void setupPlayers() {
        Player player = new Player();
        player.getPosition().set(300,300);
        GameObject.add(player);
    }
}
