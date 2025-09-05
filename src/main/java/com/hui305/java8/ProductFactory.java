package com.hui305.java8;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

/**
 * TODO
 *
 * @author bobstone
 * @version 1.0
 * @date 2024/2/14 21:13
 */
public class ProductFactory {

    final static Map<String,Supplier<Product>>  map = new HashMap<>();

    static {
        map.put("loan", Loan::new);
        map.put("stock", Stock::new);
        map.put("bond", Bond::new);
    }

    public static Product createProduct(String name){
//        switch(name){
//            case "loan": return new Loan();
//            case "stock": return new Stock();
//            case "bond": return new Bond();
//            default: throw new RuntimeException("No such product " + name);
//        }
        Supplier<Product> p = map.get(name);
        if(p != null) return p.get();
        throw new IllegalArgumentException("No such product " + name);
    }

    public static void main(String[] args) {

//        Supplier<Product> loanSupplier = Loan::new;
//        Loan loan = (Loan)loanSupplier.get();
        Product p = ProductFactory.createProduct("loan");
    }
}
