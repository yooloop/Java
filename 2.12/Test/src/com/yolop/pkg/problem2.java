package com.yolop.pkg;

import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {
        Color green = Color.GREEN;
        switch (green){
            case GREEN:
                System.out.println("匹配到绿色");
                break;
            case RED:
                System.out.println("匹配到红色");
                break;
            case YELLOW:
                System.out.println("匹配到黄色");
                break;
            case BLUE:
                System.out.println("匹配到蓝色");
                break;
            case BLACK:
                System.out.println("匹配到黑色");
                break;
            default:
                System.out.println("没匹配到颜色");
                break;
        }
    }
}


enum Color implements i1{
    RED(255,0,0),BLUE(0,0,255),BLACK(0,0,0)
    ,YELLOW(255,255,0),GREEN(0,255,0);
    private final int redValue;
    private final int greenValue;
    private final int blueValue;


    Color(int redValue, int greenValue, int blueValue) {
        this.redValue = redValue;
        this.greenValue = greenValue;
        this.blueValue = blueValue;
    }

    public int getRedValue() {
        return redValue;
    }

    public int getGreenValue() {
        return greenValue;
    }

    public int getBlueValue() {
        return blueValue;
    }

    @Override
    public void show() {
        System.out.println("getBlueValue = "+getBlueValue()+"   getGreenValue = "+getGreenValue()+
                "   getRedValue = "+getRedValue());
    }
}


interface i1{
    void show();
}