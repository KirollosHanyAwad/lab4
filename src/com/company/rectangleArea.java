package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class rectangleArea {
    int length;
    int width;
    int rtgArea;



    public void  getData() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        System.out.println("please write the length of the rectangle");
         length = Integer.parseInt(br.readLine());
        System.out.println("please write the width of the rectangle");
         width = Integer.parseInt(br.readLine());

    }

    public void computeField(){

          rtgArea = length * width;
    }

    public void fieldDisplay(){
      System.out.println("The area of the rectangle = "+ rtgArea);
    }

    public void demo() throws IOException {
        rectangleArea rectangle = new rectangleArea();

        rectangle.getData();
        rectangle.computeField();
        rectangle.fieldDisplay();
    }


}
