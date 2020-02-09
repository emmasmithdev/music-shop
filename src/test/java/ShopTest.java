import accessories.DrumSticks;
import accessories.Strings;
import instruments.Drums;
import instruments.Violin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Violin violin;
    Drums drums;
    Strings strings;
    DrumSticks drumSticks;

    @Before
    public void before(){
        strings = new Strings(15, 12, 6, "G");
        drums = new Drums("percussion", "white", "canvas", "snare", 50, 40);
        violin = new Violin("strings", "brown", "oak", 6, 100, 70);
        drumSticks = new DrumSticks(5, 2.50, "beige", "oak");
        shop = new Shop();
    }

    @Test
    public void canAddItemsToStock(){
        shop.addStock(violin);
        assertEquals(1, shop.stockCount());
    }

    @Test
    public void canRemoveItemsFromStock(){
        shop.addStock(violin);
        shop.addStock(drums);
        shop.addStock(strings);
        shop.removeStock(drums);
        assertEquals(2, shop.stockCount());
    }


}
