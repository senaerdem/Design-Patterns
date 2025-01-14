package com.example.visitordesignpattern;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Dosya nesnelerini oluştur
        TextFile textFile = new TextFile("example.txt", "Bu bir örnek metin dosyasıdır.");
        ImageFile imageFile = new ImageFile("image.jpg", 1080);
        VideoFile videoFile = new VideoFile("video.mp4", 15.5);

        // Dosyaları bir listeye ekle
        List<FileElement> files = new ArrayList<>();
        files.add(textFile);
        files.add(imageFile);
        files.add(videoFile);

        // Dosya okuyucuyu kullan
        System.out.println("Dosyalar okunuyor:");
        FileReaderVisitor fileReader = new FileReaderVisitor();
        for (FileElement file : files) {
            file.accept(fileReader); // Her dosya üzerinde okuma işlemi yapılır
        }

        System.out.println("----------------------------");

        // Dosya yazıcıyı kullan
        System.out.println("Dosyalar yazılıyor:");
        FileWriterVisitor fileWriter = new FileWriterVisitor();
        for (FileElement file : files) {
            file.accept(fileWriter); // Her dosya üzerinde yazma işlemi yapılır
        }
    }
}