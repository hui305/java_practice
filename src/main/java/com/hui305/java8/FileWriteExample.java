package com.hui305.java8;

import java.io.FileWriter;
import java.io.IOException;

/**
 * TODO
 *
 * @author bobstone
 * @version 1.0 Java Try-with-Resources：高效资源管理之道
 * @date 2025/6/15 16:41
 */
public class FileWriteExample {

    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("test.txt")) {
            fw.write("Hello, World!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
