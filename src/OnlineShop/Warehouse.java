package OnlineShop;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Warehouse {
    private Map<String, Integer> products;
    private Map<String, Integer> productStock;

    public Warehouse(){
        this.products = new HashMap<>();
        this.productStock = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock){
        products.put(product, price);
        productStock.put(product, stock);
    }

    public int price(String product){
        if(!(products.containsKey(product))){
            return -99;
        }
        else{
            return products.get(product);
        }
    }

    public int stock(String product){
        if(!(productStock.containsKey(product))){
            return 0;
        }
        else{
            return productStock.get(product);
        }
    }

    public boolean take(String product){
        if(productStock.containsKey(product) && productStock.get(product) > 0){
            productStock.put(product, productStock.get(product) - 1); // Reduce stock by 1
            return true;
        }
        return false;
    }

    public Set<String> products(){
        Set<String> names = new HashSet<>();
        for(String key: products.keySet()){
            names.add(key);
        }
        return names;
    }
}

