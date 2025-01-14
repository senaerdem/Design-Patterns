package com.example.visitordesignpattern;
import java.io.FileWriter;
import java.io.IOException;

// Concrete Visitor : Dosya yazma işlemlerini gerçekleştiren sınıf
class FileWriterVisitor implements FileVisitor {
    @Override
    public void visit(TextFile textFile) {
        // Text dosyasını yazma işlemi
        try (FileWriter writer = new FileWriter(textFile.getName())) {
            writer.write("İçerik: " + textFile.getContent());
            System.out.println("Text dosyasına yazıldı: " + textFile.getName());
        } catch (IOException e) {
            System.err.println("Text dosyasına yazılamadı: " + textFile.getName());
        }
    }

    @Override
    public void visit(ImageFile imageFile) {
        // Görüntü dosyaları yazılamaz
        System.out.println("Resim dosyaları yazılamaz: " + imageFile.getName());
    }

    @Override
    public void visit(VideoFile videoFile) {
        // Video dosyaları yazılamaz
        System.out.println("Video dosyaları yazılamaz: " + videoFile.getName());
    }
}
