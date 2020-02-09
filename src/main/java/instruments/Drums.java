package instruments;

public class Drums extends Instrument {

    private String type;

    public Drums(String family, String colour, String material, String type, double price, double costPrice) {
        super(family, colour, material, price, costPrice);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public String play(){
        return "boom tss boom tss";
    }

    public double calculateMarkup(){
        return getPrice() - getCostPrice();
    }
}
