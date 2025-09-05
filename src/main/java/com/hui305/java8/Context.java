package com.hui305.java8;

import java.util.function.IntBinaryOperator;

/**
 * TODO
 *
 * @author bobstone
 * @version 1.0
 * @date 2024/2/12 20:16
 */
public class Context {

    private IntBinaryOperator strategy;

    public Context(IntBinaryOperator strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2){
        return strategy.applyAsInt(num1,num2);
    }
}
