package com.company;


import java.io.IOException;

public class Main {


    public static void main(String[] args) throws IOException {
//task 1
        rectangleArea rtg = new rectangleArea();

        rtg.getData();
        rtg.computeField();
        rtg.fieldDisplay();

//task 2

        car car1 = new car("Corolla", "Toyota", 2022, 910000, "Lilac", 78);

        System.out.println("\n\n" + car1.toString());

        car1.sell(15);

        System.out.println(car1.getColor());

        int year = car1.getYear();

        car1.setColor("Navy");

        System.out.println(car1.toString());

    }
}

