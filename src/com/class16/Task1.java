package com.class16;

public class Task1 {
    String brand,color;
    int size,weight;
    
    void call() {
        System.out.println("This "+brand+" can call");
    }
    void text() {
        System.out.println("This "+brand+" can text");
    }
    void takePictures() {
        System.out.println("This "+brand+" can take pictures");
    }
public static void main(String[] args) {
    Task1 p1=new Task1();
    p1.brand="iphone";
    p1.color="Black";
    p1.size=5;
    p1.weight=20;
    p1.call();
    p1.text();
    p1.takePictures();
    
    Task1 p2=new Task1();
    p2.brand="android";
    p2.color="Blue";
    p2.size=4;
    p2.weight=10;
    p2.call();
    p2.text();
    p2.takePictures();
    
    Task1 p3=new Task1();
    p3.brand="nokia";
    p3.color="Silver";
    p3.size=5;
    p3.weight=20;
    p3.call();
    p3.text();
    p3.takePictures();
    
}
}