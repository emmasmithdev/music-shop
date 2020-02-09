import instruments.Drums;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumsTest {

    Drums drums;

    @Before
    public void before(){
        drums = new Drums("percussion", "white", "canvas", "snare", 50, 40);
    }

    @Test
    public void hasFamily(){
        assertEquals("percussion", drums.getFamily());
    }

    @Test
    public void hasColour(){
        assertEquals("white", drums.getColour());
    }

    @Test
    public void hasMaterial(){
        assertEquals("canvas", drums.getMaterial());
    }

    @Test
    public void hasType(){
        assertEquals("snare", drums.getType());
    }

    @Test
    public void hasPrice(){
        assertEquals(50, drums.getPrice(), 0.01);
    }

    @Test
    public void hasCostPrice(){
        assertEquals(40, drums.getCostPrice(), 0.01);
    }

    @Test
    public void canSetPrice(){
        drums.setPrice(60);
        assertEquals(60, drums.getPrice(), 0.01);
    }

    @Test
    public void canPlay(){
        assertEquals("boom tss boom tss", drums.play());
    }
}
