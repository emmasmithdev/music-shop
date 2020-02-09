package accessories;

public class DrumSticks extends Accessory {

    private String colour;
    private String material;

    public DrumSticks(double price, double costPrice, String colour, String material) {
        super(price, costPrice);
        this.colour = colour;
        this.material = material;
    }

    public String getColour() {
        return colour;
    }

    public String getMaterial() {
        return material;
    }

    public double calculateMarkup(){
        return getPrice() - getCostPrice();
    }
}
