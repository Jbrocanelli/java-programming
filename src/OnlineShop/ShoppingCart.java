package OnlineShop;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    Map<String, Item> cart;

    public ShoppingCart(){
        this.cart = new HashMap<>();
    }

    public void add(String product, int price){
        if(cart.containsKey(product)){
            cart.get(product).increaseQuantity();
        }
        else{
            cart.put(product, new Item(product, 1, price));
        }
    }

    public int price(){
        int totalValue = 0;
        for(Item item: cart.values()){
            totalValue += item.price();
        }
        return totalValue;
    }

    public void print(){
        for(String product : cart.keySet()){
            System.out.println(cart.get(product));
        }
    }
}
