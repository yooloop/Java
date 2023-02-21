package com.yolop.lanboda;

public class problem1 {
    public static void main(String[] args) {
        eat(new interface1() {
            @Override
            public void can_eat() {
                System.out.println("匿名内部类重写");
            }
        });

        eat(() ->{
            System.out.println("lamada表达式重写");
        });
    }



    public static void eat(interface1 interface1){
        interface1.can_eat();
    }
}


