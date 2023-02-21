package com.yolop.pkg;

import java.util.Scanner;

public class problem4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("请输入第一个整数：");
            int a = Integer.parseInt(scanner.next());
            System.out.print("请输入第二个整数：");
            int b = Integer.parseInt(scanner.next());
            double result = new tools().cal(a,b);
            System.out.println(result);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("参数个数不对");
        } catch (ArithmeticException e){
            System.out.println("除0，发生算数错误！");
        }
    }
}

class tools {
    public double cal(int a, int b) {
        return (double) a / b;
    }
}