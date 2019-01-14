import org.junit.*;
import src.model.*;

import java.util.ArrayList;

import static org.junit.Assert.assertTrue;


public class ModelTest
{
    World one = new World();

    @Before
    public void setup()
    {
        one.addGameObject( new Weapon( "Sword", 15) );
        one.addGameObject( new Hero("Dave") );
        one.addGameObject( new Equipment("Helmet", 104 ) );
    }

    @Test 
    public void gameObjectCreation()
    {
        ArrayList<GameObejct> buffer = one.getGameObejcts();
        assertTrue( buffer.get( 0 ).getName().equals("Sword") );
        assertTrue( buffer.get( 1 ).getName().equals("Dave") );
        assertTrue( buffer.get( 2 ).getName().equals("Helmet") );
    }
}