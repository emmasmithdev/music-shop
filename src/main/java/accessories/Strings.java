package accessories;

public class Strings extends Accessory{

    private int number;
    private String type;

    public Strings(double price, double costPrice, int number, String type) {
        super(price, costPrice);
        this.number = number;
        this.type = type;
    }

    public int getNumber() {
        return number;
    }

    public String getType() {
        return type;
    }

    public double calculateMarkup(){
        return getPrice() - getCostPrice();
    }
}
