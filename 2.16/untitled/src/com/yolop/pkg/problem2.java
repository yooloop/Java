package com.yolop.pkg;


import java.io.*;

public class problem2 {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream objectInputStream = new ObjectOutputStream(new FileOutputStream("F:\\java\\2.16\\untitled\\src\\c" +
                "om\\yolop\\pkg\\test2.txt"));
        Student zs = new Student("zs", 6);
        objectInputStream.writeObject(zs);

        objectInputStream.close();

    }

}
