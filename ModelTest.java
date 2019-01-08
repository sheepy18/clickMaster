import org.junit.*;

import src.model.*;

public class ModelTest 
{
    Item itemOne;

    @Before
    public void setup()
    {
        itemOne = new Weapon("Weapon", 13);
    }

    @Test 
    public void itemCreation()
    {
        assertTrue( itemOne.getName().equals( "Weapon" ) ); 
    }
}