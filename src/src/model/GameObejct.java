package src.model;

import java.util.Observable;

public abstract class GameObejct extends Observable {
    private String name;
    private int level;

    GameObejct( String name ){
        this.name = name;
        this.level = 0;
    }

    public String getName() { return name; }
    public int getLevel() { return level; }
}
