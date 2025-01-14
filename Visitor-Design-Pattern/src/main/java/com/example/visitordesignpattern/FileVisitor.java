package com.example.visitordesignpattern;
// Visitor arayüzü : Farklı dosya türleri için işlemleri tanımlayan arayüz
interface FileVisitor {
    void visit(TextFile textFile); // Text dosyaları için işlem
    void visit(ImageFile imageFile); // Görüntü dosyaları için işlem
    void visit(VideoFile videoFile); // Video dosyaları için işlem
}