package src.model;

public class Item extends GameObejct {
    private int durability; //given in percent

    Item( String name ) {
        super( name );
        durability = 100;
    }

    public int getDurability() {
        return durability;
    }
}
