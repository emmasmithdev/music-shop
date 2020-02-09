import behaviours.ISell;

import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> stock;

    public Shop() {
        this.stock = new ArrayList<>();
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public int stockCount(){
        return getStock().size();
    }

    public void addStock(ISell item){
        this.stock.add(item);
    }

    public void removeStock(ISell item){
        this.stock.remove(item);
    }

    public double calculateTotalProfit(){
        double total = 0;
        for(ISell item : this.stock){
            double markUp = item.calculateMarkup();
            total += markUp;
        }
        return total;
    }
}
