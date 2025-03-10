package OnlineShop;

public class Item {
    String product;
    int qty;
    int unitPrice;

    public Item(String product, int qty, int unitPrice) {
        this.product = product;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    public int price(){
        return this.unitPrice * this.qty;
    }

    public void increaseQuantity(){
        this.qty += 1;
    }

    public String toString(){
        return this.product + ": " + this.qty;
    }
}

