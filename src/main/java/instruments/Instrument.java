package instruments;

import behaviours.IPlay;
import behaviours.ISell;

public abstract class Instrument implements IPlay, ISell {

    private String family;
    private String colour;
    private String material;
    private double price;
    private double costPrice;

    public Instrument(String family, String colour, String material, double price, double costPrice) {
        this.family = family;
        this.colour = colour;
        this.material = material;
        this.price = price;
        this.costPrice = costPrice;
    }

    public String getFamily() {
        return family;
    }

    public String getColour() {
        return colour;
    }

    public String getMaterial() {
        return material;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getCostPrice() {
        return costPrice;
    }
}
