package instruments;

public class Violin extends Instrument {

    private int numOfStrings;

    public Violin(String family, String colour, String material, int numOfStrings, double price, double costPrice) {
        super(family, colour, material, price, costPrice);
        this.numOfStrings = numOfStrings;
    }

    public int getNumOfStrings() {
        return numOfStrings;
    }

    public String play(){
        return "screech screech";
    }

    public double calculateMarkup(){
        return getPrice() - getCostPrice();
    }
}
