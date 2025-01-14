package com.example.visitordesignpattern;
// Concrete Element : Video dosyasını temsil eden sınıf
class VideoFile implements FileElement {
    private String name;
    private double duration;

    public VideoFile(String name, double duration) {
        this.name = name;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public double getDuration() {
        return duration;
    }

    // Visitor'ın bu nesneyi işlemesi için accept metodu
    @Override
    public void accept(FileVisitor visitor) {
        visitor.visit(this);
    }
}
