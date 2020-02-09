package accessories;

import behaviours.ISell;

public abstract class Accessory implements ISell {

    private double price;
    private double costPrice;

    public Accessory(double price, double costPrice) {
        this.price = price;
        this.costPrice = costPrice;
    }

    public double getPrice() {
        return price;
    }

    public double getCostPrice() {
        return costPrice;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
