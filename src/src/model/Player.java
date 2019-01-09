package src.model;

public class Player extends GameObejct {
    private int livePoints;
    private Ability abilities[];

    Player( String name ){
        super( name );
        abilities = new Ability[5];
    }

    public int getLivePoints() {
        return livePoints;
    }

    public Ability[] getAbilities() {
        return abilities;
    }
}
