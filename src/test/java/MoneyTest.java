import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MoneyTest {
    private Money money5;
    private Money money50;
    private Money money10;

    @Before
    public void before(){
        money5 = new Money(MoneyType.FIVE);
        money10 = new Money(MoneyType.TEN);
        money50 = new Money(MoneyType.FIFTY);

    }
    @Test
    public void canGetMoneyType(){
        assertEquals(MoneyType.FIFTY, money50.getMoneyType());
    }
    @Test
    public void canGetMoneyValue(){
        assertEquals(5, money5.getValueFromEnum());
    }
}
