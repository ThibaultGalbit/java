package map;

/**
 * Tile
 */
public class Tile {

    protected char charactere;
    protected Boolean is_walkable;
    protected int x;
    protected int y;

    public Tile(char charactere, Boolean is_walkable, int x, int y){
        this.charactere = charactere;
        this.is_walkable = is_walkable;
        this.x = x;
        this.y = y;
    }

    public char getCharactere() {
        return (this.charactere);
    }

    public int getX() {
        return (this.x);
    }
    public int getY() {
        return (this.y);
    }
}