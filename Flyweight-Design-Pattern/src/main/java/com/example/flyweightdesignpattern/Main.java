package com.example.flyweightdesignpattern;
public class Main {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();

        // Aynı türde ve renkteki şekiller paylaşılarak yeniden kullanılacak
        Shape circleRed = factory.getShape("Circle", "Red");
        circleRed.draw(10, 20, 30);
        System.out.println();

        Shape squareBlue = factory.getShape("Square", "Blue");
        squareBlue.draw(40, 50, 60);
        System.out.println();

        Shape circleRed2 = factory.getShape("Circle", "Red");
        circleRed2.draw(70, 80, 90);
        System.out.println();

        Shape triangleGreen = factory.getShape("Triangle", "Green");
        triangleGreen.draw(100, 110, 120);
    }
}