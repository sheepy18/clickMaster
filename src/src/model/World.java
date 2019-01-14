package src.model;

import java.util.ArrayList;

public class World {
    private ArrayList<GameObejct> gameObejcts;

    public World(){
        gameObejcts = new ArrayList<>();
    }

    public void addGameObject( GameObejct gobj ){
        gameObejcts.add( gobj );
    }

    public ArrayList<GameObejct> getGameObejcts() {
        return gameObejcts;
    }
}
