package com.example.visitordesignpattern;
// Concrete Visitor : Dosya okuma işlemlerini gerçekleştiren sınıf
class FileReaderVisitor implements FileVisitor {
    @Override
    public void visit(TextFile textFile) {
        System.out.println("Text dosyası okunuyor: " + textFile.getName());
        System.out.println("İçerik: " + textFile.getContent());
    }

    @Override
    public void visit(ImageFile imageFile) {
        System.out.println("Resim dosyası okunuyor: " + imageFile.getName());
        System.out.println("Çözünürlük: " + imageFile.getResolution() + "p");
    }

    @Override
    public void visit(VideoFile videoFile) {
        System.out.println("Video dosyası okunuyor: " + videoFile.getName());
        System.out.println("Süre: " + videoFile.getDuration() + " dakika");
    }
}
