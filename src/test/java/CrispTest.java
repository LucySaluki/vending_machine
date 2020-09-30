import Products.Crisp;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CrispTest {

    private Crisp crisp;

    @Before
    public void before(){
        crisp = new Crisp("Salt & Vinegar", "Walkers", 0.50);
    }

    @Test
    public void canGetName(){
        assertEquals("Salt & Vinegar", crisp.getName());
    }

    @Test
    public void canGetBrand(){
        assertEquals("Walkers", crisp.getBrand());
    }

    @Test
    public void canGetPrice(){
        assertEquals(0.50, crisp.getPrice(),0.01);
    }
}
