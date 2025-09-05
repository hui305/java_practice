package com.hui305.java8;

import java.util.function.IntUnaryOperator;

/**
 * TODO
 *
 * @author bobstone
 * @version 1.0
 * @date 2024/2/12 21:00
 */
public class ChainOfR {

    public static void main(String[] args) {

        IntUnaryOperator op1 = t -> t + 10;
        IntUnaryOperator op2 = t -> t * 10;

        // Using andThen()
        int a = op1.andThen(op2).applyAsInt(5);
        System.out.println(a);

        /*
          通过字面的意思来理解，andThen是 “ 然后” 的意思，
          a.andThen(b)的意思就是a先执行然后b开始执行。
          同样的compose由 " 构成" 的意思,那么a.compose(b) 的意思就是b先执行，然后a开始执行
         */

        // Using compose()
        int b = op1.compose(op1).applyAsInt(5);
        System.out.println(b);
    }
}
