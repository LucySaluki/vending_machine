import Products.Crisp;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CrispTest {

    private Crisp crisp;

    @Before
    public void before(){
        crisp = new Crisp("Salt & Vinegar", "Walkers", 1.00);
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
        assertEquals(1.00, crisp.getPrice(),0.01);
    }
}
