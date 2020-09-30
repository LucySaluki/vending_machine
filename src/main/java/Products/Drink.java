package Products;

public class Drink extends Product{
    private double price;

    public Drink (String name, String brand, double price) {
        super(name, brand);
        this.price=price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
