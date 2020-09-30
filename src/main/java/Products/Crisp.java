package Products;

public class Crisp extends Product{
    private double price;

    public Crisp(String name, String brand, double price) {
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
