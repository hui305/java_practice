package com.hui305.java8;

import java.util.function.Predicate;

/**
 * TODO
 *
 * @author bobstone
 * @version 1.0
 * @date 2024/2/11 19:41
 */
public class Validator {
    private final Predicate<String> validationStrategy;

    public Validator(Predicate<String> v) {
        this.validationStrategy = v;
    }

    public boolean validate(String s){
        return validationStrategy.test(s);
    }

    public static void main(String[] args) {

        Validator lowerCaseValidator = new Validator((String s)-> s.matches("[a-z]]"));
        boolean b2 = lowerCaseValidator.validate("bbbb");
        Validator numericValidator = new Validator((String s)-> s.matches("\\d"));
        boolean b1 = numericValidator.validate("aaaaa");
    }
}
