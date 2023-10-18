package main.java;

public class Main {
    public static void main(String[] args) {
        /*CPU coreI5 = new CPU(3.5f, "CoreI5");
        System.out.println(coreI5);*/
        Computer hp250 = new Computer(15.0,
                new CPU(1.5, "core2DOU"),
                new RAM(4.0, "DDOU")
        );

        System.out.println("The computer is an: hp 250.");
    }
}
