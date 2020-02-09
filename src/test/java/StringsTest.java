import accessories.Strings;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringsTest {

    Strings strings;

    @Before
    public void before(){
        strings = new Strings(15, 12, 6, "G");
    }

    @Test
    public void hasPrice(){
        assertEquals(15, strings.getPrice(), 0.01);
    }

    @Test
    public void hasCostPrice(){
        assertEquals(12, strings.getCostPrice(),0.01);
    }

    @Test
    public void hasNumberOfStrings(){
        assertEquals(6, strings.getNumber());
    }

    @Test
    public void hasType(){
        assertEquals("G", strings.getType());
    }

    @Test
    public void canSetPrice(){
        strings.setPrice(14);
        assertEquals(14, strings.getPrice(), 0.01);
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(3, strings.calculateMarkup(), 0.01);
    }
}
