package com.yolop.pkg;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class problem1 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(Files.newInputStream(Paths.get("F:\\Java素材\\test1.txt")));
        OutputStreamWriter ops = new OutputStreamWriter(Files.newOutputStream(Paths.get("F:\\java\\2.16\\" +
                "untitled\\src\\com\\yolop\\pkg\\test1.txt")));

        int len;
        char[] chars = new char[4];
        while((len = isr.read(chars)) != -1){
            ops.write(chars,0,len);
        }

        isr.close();
        ops.close();
    }
}
