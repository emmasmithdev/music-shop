import accessories.DrumSticks;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumSticksTest {

    DrumSticks drumSticks;

    @Before
    public void before(){
        drumSticks = new DrumSticks(5, 2.50, "beige", "oak");
    }

    @Test
    public void hasPrice(){
        assertEquals(5, drumSticks.getPrice(), 0.01);
    }

    @Test
    public void hasCostPrice(){
        assertEquals(2.50, drumSticks.getCostPrice(), 0.01);
    }

    @Test
    public void hasColour(){
        assertEquals("beige", drumSticks.getColour());
    }

    @Test
    public void hasMaterial(){
        assertEquals("oak", drumSticks.getMaterial());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(2.50, drumSticks.calculateMarkup(), 0.01);
    }

    @Test
    public void canSetPrice(){
        drumSticks.setPrice(6);
        assertEquals(6, drumSticks.getPrice(), 0.01);
    }
}
