package com.hui305.java8;

import java.util.Optional;

/**
 * TODO
 *
 * @author bobstone
 * @version 1.0
 * @date 2025/6/15 16:12
 */
public class OptionalDemo {

    public static void main(String[] args) {
        Optional<Member> optional = getMemberByIdFromDB();
//        optional.ifPresent(mem -> {
//            System.out.println("会员姓名是：" + mem.getName());
//        });
        String name = null;
        Optional<String> optOrNull = Optional.ofNullable(name);
        System.out.println(optOrNull); // 输出：Optional.empty

        Optional<String> opt = Optional.of("沉默王二");
        System.out.println(opt.isEmpty()); // 输出：false
        opt.ifPresentOrElse(str -> System.out.println(str.length()), () -> System.out.println("为空"));

    }

    public static Optional<Member> getMemberByIdFromDB() {
        boolean hasName = false;
        if (hasName) {
            return Optional.of(new Member("沉默王二"));
        }
        return Optional.empty();
    }
}

class Member {

    public Member(String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }
}
// getter / setter