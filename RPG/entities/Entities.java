package entities;

import enums.*;

/**
 * Entities
 */


public class Entities {

    protected int hp;
    protected int x;
    protected int y;

    public Entities() {}

    public Entities(int hp, int x, int y) {
        this.hp = hp;
        this.x = x;
        this.y = y;
    }

    public int getHp() {
        return this.hp;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public String toString() {
        return("Our entity has " + this.hp + "hp. Cordinate " + this.x + ";" + this.y);
    }


    public void move(Direction direction) {
        switch (direction) {
            case UP:
                this.y--;
                break;
            case DOWN:
                this.y++;
                break;
            case RIGHT:
                this.x++;
                break;
            case LEFT:
                this.x--;
                break;
        }
    }

    public void move(String direction) {
        switch (direction) {
            case "z":
                move(Direction.UP);
                break;
            case "s":
                move(Direction.DOWN);
                break;
            case "d":
                move(Direction.RIGHT);
                break;
            case "q":
                move(Direction.LEFT);
                break;
            default:
                System.out.println("Thid direction doesn't exist");
                break;
        }
    }
}