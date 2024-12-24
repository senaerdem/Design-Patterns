package com.example.flyweightdesignpattern;
import java.util.*;
// FlyweightFactory
class ShapeFactory {
    private Map<String, Shape> shapeMap = new HashMap<>(); // Şekillerin paylaşılanlarını saklamak için bir map

    // Verilen tür ve renkle şekil alır veya yeni şekil yaratır
    public Shape getShape(String type, String color) {
        String key = type + ":" + color; // Key, type ve color ile birleşir
        Shape shape = shapeMap.get(key); // Mapte var olup olmadığını kontrol et

        // Eğer şekil daha önce yaratılmamışsa
        if (shape == null) {
            // Yeni şekil yaratılır ve mape eklenir
            switch (type) {
                case "Circle":
                    shape = new Circle(color);
                    break;
                case "Square":
                    shape = new Square(color);
                    break;
                case "Triangle":
                    shape = new Triangle(color);
                    break;
            }
            shapeMap.put(key, shape); // Yeni şekil mape eklenir
            System.out.println("Created new " + type + " of color " + color);
        }
        return shape; // Var olan veya yeni yaratılmış şekil geri döndürülür
    }
}