package com.yolop.pkg;

public class problem1 {
    public static void main(String[] args) {
        Car car = new Car(34);
        Car.Air air = car.new Air();
        System.out.println(air.flow());

    }
}


class Car{
    private static double temperature;

    public Car(double temperature) {
        Car.temperature = temperature;
    }

    class Air{
        public String flow(){
            if(temperature < 0){
                return "吹暖气";
            }else if(temperature > 40){
                return "吹冷气";
            }
            return "donothing";
        }
    }
}