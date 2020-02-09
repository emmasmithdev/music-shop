import instruments.Violin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class ViolinTest {

    Violin violin;

    @Before
    public void before(){
        violin = new Violin("strings", "brown", "oak", 6, 100, 70);
    }

    @Test
    public void hasFamily(){
        assertEquals("strings", violin.getFamily());
    }
    @Test
    public void hasColour(){
        assertEquals("brown", violin.getColour());
    }
    @Test
    public void hasMaterial(){
        assertEquals("oak", violin.getMaterial());
    }
    @Test
    public void hasNumOfStrings(){
        assertEquals(6, violin.getNumOfStrings());
    }
    @Test
    public void hasPrice(){
        assertEquals(100, violin.getPrice(), 0.01);
    }
    @Test
    public void hasCostPrice(){
        assertEquals(70, violin.getCostPrice(), 0.01);
    }
    @Test
    public void canSetPrice(){
        violin.setPrice(120);
        assertEquals(120, violin.getPrice(), 0.01);
    }
    @Test
    public void canPlay(){
        assertEquals("screech screech", violin.play());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(30, violin.calculateMarkup(), 0.01);
    }


}
