package map;

import java.util.ArrayList;

import entities.Player;

/**
 * Map
 */
public class Map {

    private ArrayList<Tile> map;
    private Player player;

    public Map() {

        this.player = new Player();
        initDefaultMap();
    }

    public Map(Player player) {
        this.player = player;
        initDefaultMap();
    }

    public Map(String path) {

    }


    public Player getPlayer() {
        return (this.player);
    }

    public void initDefaultMap() {
        int x = 0;
        int y = 0;

        this.map = new ArrayList<Tile>();

        //First line
        for (x = 0; x < 10; x++) {
            this.map.add(new Wall(x, y));
        }
        y++;
        x = 0;
        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < 10; i++) {
                if (i == 0 || i == 9) {
                    this.map.add(new Wall(x, y));
                } else {
                    this.map.add(new Floor(x, y));
                }
                x++;
            }
            x = 0;
            y++;
        }

        for (x = 0; x < 10; x++) {
            this.map.add(new Wall(x, y));
        }
    }

    public void drawMap() {
        int y = 0;
        for(Tile tile : map) {

            if (tile.getY() > y) {
                System.out.print('\n');
                y++;
            }

            if (tile.getX() == this.player.getX() && tile.getY() == this.player.getY()) {
                System.out.print('P');
            } else {
                System.out.print(tile.getCharactere());
            }    
        }
        System.out.println('\n');
    }
}