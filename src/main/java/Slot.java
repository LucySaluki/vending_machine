import Products.Product;

import java.util.ArrayList;

public class Slot {

    private SlotType slotType;
    private ArrayList<Product> products;

    public Slot(SlotType slotType) {
        this.slotType = slotType;
        this.products= new ArrayList<Product>();
    }

    public SlotType getSlotType() {
        return slotType;
    }

    public int getPositionValueFromEnum(){
        return this.slotType.getPosition();
    }

    public int getRowValueFromEnum(){
        return this.slotType.getRow();
    }

    public int getColumnValueFromEnum(){
        return this.slotType.getColumn();
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void addProduct(Product product){
        this.products.add(product);
    }

    public void serveProduct(){
        this.products.remove(0);
    }
}
