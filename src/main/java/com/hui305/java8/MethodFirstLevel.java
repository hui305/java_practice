package com.hui305.java8;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * TODO
 *
 * @author bobstone
 * @version 1.0
 * @date 2024/2/11 15:02
 */
public class MethodFirstLevel {

    public static  List<String> getlist(List<String> stringList,Predicate<String> applePredicate){
        List<String> resultList = new ArrayList<>();
        for(String s : stringList){
            if(applePredicate.test(s)){
                resultList.add(s);
            }
        }
        return resultList;
    }
    public static void main(String[] args) {

        File[] hiddenFiles = new File(".").listFiles(File::isHidden);
//        String[] s = {"apple","orange","banana"};
        List<String> sList = Arrays.asList("apple","orange","banana");
        List<String> rlist = getlist(sList,(s)-> s.length()>=6);
        System.out.println(rlist.size());
    }
}
