import Products.Sweet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SweetTest {

    private Sweet sweet;

    @Before
    public void before(){
        sweet = new Sweet("Flake", "Cadburys", 0.65);
    }

    @Test
    public void canGetName(){
        assertEquals("Flake", sweet.getName());
    }

    @Test
    public void canGetBrand(){
        assertEquals("Cadburys", sweet.getBrand());
    }

    @Test
    public void canGetPrice(){
        assertEquals(0.65, sweet.getPrice(),0.01);
    }
}
