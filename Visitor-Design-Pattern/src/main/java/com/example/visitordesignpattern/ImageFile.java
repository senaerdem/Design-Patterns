package com.example.visitordesignpattern;
// Concrete Element : Görüntü dosyasını temsil eden sınıf
class ImageFile implements FileElement {
    private String name;
    private int resolution;

    public ImageFile(String name, int resolution) {
        this.name = name;
        this.resolution = resolution;
    }

    public String getName() {
        return name;
    }

    public int getResolution() {
        return resolution;
    }

    // Visitor'ın bu nesneyi işlemesi için accept metodu
    @Override
    public void accept(FileVisitor visitor) {
        visitor.visit(this);
    }
}