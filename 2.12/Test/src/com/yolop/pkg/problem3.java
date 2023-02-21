package com.yolop.pkg;

import java.util.Objects;
import java.util.Scanner;

public class problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        while (true) {
            System.out.print("请输入一个整数：");
            try {
                a = Integer.parseInt(scanner.next());//转型，判断是否为整数
                break;
            } catch (NumberFormatException e) {
                System.out.print("输入的不是一个整数，");
            }
        }

        System.out.println("输入的整数为："+ a);
    }
}
