import Products.Drink;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrinkTest {
    private Drink drink;

    @Before
    public void before(){
        drink = new Drink("Aranciata Rossa", "San Pellegrino", 1.00);
    }

    @Test
    public void canGetName(){
        assertEquals("Aranciata Rossa", drink.getName());
    }

    @Test
    public void canGetBrand(){
        assertEquals("San Pellegrino", drink.getBrand());
    }

    @Test
    public void canGetPrice(){
        assertEquals(1.00, drink.getPrice(),0.01);
    }
}
