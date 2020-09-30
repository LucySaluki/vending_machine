package Products;

public class Sweet extends Product{

    private double price;

    public Sweet(String name, String brand, double price) {
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
