package src.model;

public class Equipment extends Item {
    private int armor;

    public Equipment( String name, int armor ){
        super( name );
        this.armor = armor;
    }
}
