package com.hui305.java8;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

/**
 * TODO
 *
 * @author bobstone
 * @version 1.0
 * @date 2024/2/12 20:15
 */
public class StrategyPatternDemo {

    public static void main(String[] args) {
        Context context = new Context((x,y)-> x+y);
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context((x,y)-> x-y);
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context((x,y)-> x*y);
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));

        Map<String,String> contacts = new HashMap<>();
        contacts.put("John","12345");
        contacts.put("Bill","34567");
        contacts.put("Jack","22345");

        BiConsumer<String,String> bb = (name,phone)-> System.out.println(name+"--"+phone);
        contacts.forEach(bb);
    }
}
